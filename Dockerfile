# syntax=docker/dockerfile:1

FROM eclipse-temurin:17-jdk-jammy as base
WORKDIR /app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:resolve
COPY src ./src
ARG OTEL_AGENT_VERSION="1.12.1"
RUN curl --silent --fail -L "https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/download/v${OTEL_AGENT_VERSION}/opentelemetry-javaagent.jar" \
    -o "/tmp/opentelemetry-javaagent.jar"

FROM base as development
CMD ["./mvnw", "spring-boot:run", "-Dspring-boot.run.jvmArguments='-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5000'"]

FROM base as build
RUN ./mvnw package spring-boot:repackage

FROM eclipse-temurin:17-jre-jammy as production

COPY --from=build /app/target/auth-*.jar /auth.jar
COPY --from=base /app/src/main/resources/otel.properties /otel.properties
COPY --from=base /tmp/opentelemetry-javaagent.jar /otel-javaagent.jar

# Entrypoint
COPY ./docker-entrypoint.sh /
RUN chmod +x /docker-entrypoint.sh
ENTRYPOINT ["/docker-entrypoint.sh"]

EXPOSE 5000
EXPOSE 5001