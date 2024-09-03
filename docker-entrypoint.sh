#!/usr/bin/env bash
echo 'Start Web Server'
SPRING_PROFILES_ACTIVE=$APP_ENV java -Djava.security.egd=file:/dev/./urandom -jar /dhl.jar com.lolstate.auth.Application -javaagent:/otel-javaagent.jar -Dotel.javaagent.configuration-file=/otel.properties