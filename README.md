# user-java-service
auth service by Java Spring Boot

# Overview
User Java Service

## Prerequisites
- [JDK] 11 or higher
- [Maven] 3.8 or higher
- [MySQL] running on Docker
- [Postman] An HTTP client
- [IntelIJ] IDE
- [Docker] (https://docs.docker.com/get-docker/) 20.10 or later

# Getting Started


# Project Structure
```
user-service-java
├── .gitignore
├── .mvn
│   └── wrapper
│       ├── maven-wrapper.jar
│       └── maven-wrapper.properties
├── Dockerfile
├── Makefile
├── README.md
├── dependency-reduced-pom.xml
├── docker-compose.yml
├── docker-entrypoint.sh
├── mvnw
├── mvnw.cmd
├── pom.xml
├── src
│   ├── .DS_Store
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── lolstate
│   │   │           └── auth
│   │   │               ├── Application.java
│   │   │               ├── config
│   │   │               │   └── Config.java
│   │   │               ├── constant
│   │   │               │   └── ErrorCode.java
│   │   │               ├── controller
│   │   │               │   ├── BaseController.java
│   │   │               │   └── UserController.java
│   │   │               ├── dto
│   │   │               │   ├── request
│   │   │               │   │   └── LoginQuery.java
│   │   │               │   └── response
│   │   │               │       ├── BaseResponse.java
│   │   │               │       ├── ServiceResponse.java
│   │   │               │       └── UserResponse.java
│   │   │               ├── model
│   │   │               │   ├── BaseEntity.java
│   │   │               │   └── UserEntity.java
│   │   │               ├── repository
│   │   │               │   └── UserRepository.java
│   │   │               ├── services
│   │   │               │   ├── UserService.java
│   │   │               │   └── impl
│   │   │               │       └── UserServiceImpl.java
│   │   │               └── utils
│   │   │                   └── ObjectConvertUtils.java
│   │   └── resources
│   │       ├── application-local.yml
│   │       ├── application-prod.yml
│   │       ├── application.yml
│   │       └── db
│   │           └── migration
│   │               └── V1__create_users_table.sql
│   └── test
│       └── java
│           └── com
│               └── lolstate
│                   └── auth
│                       └── BaseControllerTest.java
```