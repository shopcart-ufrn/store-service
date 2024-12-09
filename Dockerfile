FROM gradle:8-jdk21 AS builder

WORKDIR /app

COPY . .

RUN gradle build --no-daemon

FROM openjdk:21-jdk-slim-bullseye

WORKDIR /app

EXPOSE 8080

COPY --from=builder /app/build/libs/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]

