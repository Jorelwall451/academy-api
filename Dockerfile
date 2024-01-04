FROM openjdk:17-alpine
LABEL authors="jorelwall451"

WORKDIR /app

COPY pom.xml .

RUN mvn dependency:go-offline

COPY Domain ./Domain

RUN mvn package

CMD ["java", "-jar", "target/app.jar"]

ENTRYPOINT ["top", "-b"]