# Base image with Java
FROM openjdk:8-jdk-alpine

ARG MONGODB_HOST=mongodev
ENV MONGODB_HOST=${MONGO_HOST}

ARG MONGODB_PORT=27017
ENV MONGODB_PORT=${MONGO_PORT}

# Expose port 8080
EXPOSE 8080

ARG JAR_FILE="target/projet-spring-boot-0.0.1-SNAPSHOT.jar"

ADD ${JAR_FILE} app.jar

CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]