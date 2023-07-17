#
# Build stage
#
FROM maven:3.6.3-jdk-11 AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

#
# Package stage
#
FROM openjdk:11.0.16-jdk-oracle
MAINTAINER bishoy.com
COPY --from=build /home/app/target/practice-spring-0.0.1-SNAPSHOT.jar practice-spring-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/practice-spring-0.0.1-SNAPSHOT.jar"]