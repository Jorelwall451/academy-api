FROM gradle:7.3.3-jdk11 as BUILD
WORKDIR /app
COPY . .
RUN gradle clean build

FROM adoptopenjdk:11-jre-hotspot
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "app.jar" ]