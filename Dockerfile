FROM maven:3.6.3-openjdk-17

WORKDIR /academy-api

COPY pom.xml .
COPY Domain ./Domain

RUN mvn clean install package
RUN mvn package