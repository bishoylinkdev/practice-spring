FROM openjdk:11.0.16-jdk-oracle
MAINTAINER bishoy.com
COPY target/practice-spring-0.0.1-SNAPSHOT.jar practice-spring-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/practice-spring-0.0.1-SNAPSHOT.jar"]