FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
ARG APP_NAME="mock-api"

WORKDIR /app

COPY ${JAR_FILE} /app/${APP_NAME}.jar
COPY config /app/config

EXPOSE 8243
ENTRYPOINT ["java","-Dspring.profiles.active=development", "-jar","mock-api.jar"]