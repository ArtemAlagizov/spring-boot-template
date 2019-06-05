FROM maven:3.5-jdk-8 as BUILD

COPY src /usr/src/spring-boot-template/src
COPY pom.xml /usr/src/spring-boot-template

RUN mvn -f /usr/src/spring-boot-template/pom.xml install

FROM openjdk:8

COPY --from=BUILD /usr/src/spring-boot-template/target/*.jar  /app.jar