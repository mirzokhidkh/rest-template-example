# build
FROM maven:3.8-openjdk-17 as builder
ARG APP_NAME=${APP_NAME}
RUN mkdir -p /root/.m2 \
    && mkdir /root/.m2/repository
WORKDIR /app
COPY . /app/.
COPY pom.xml .
RUN mvn clean install  \
    && mvn package -B -e -Dmaven.test.skip
RUN ls /app
RUN ls /app/target

# upload
FROM maven:3.8-openjdk-17
ARG APP_NAME=${APP_NAME}
ENV APP_NAME=${APP_NAME}

WORKDIR /app

COPY ./config /app/config
COPY --from=builder /app/target/${APP_NAME}.jar ./${APP_NAME}.jar

EXPOSE 8243

ENTRYPOINT java -jar ${APP_NAME}.jar --server.port=9191

