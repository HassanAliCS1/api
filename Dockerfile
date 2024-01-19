FROM ubuntu:latest
LABEL authors="hassanali"

ENTRYPOINT ["top", "-b"]

# Use the official amazoncorretto base image for Java 17
FROM amazoncorretto:17

# Expose the port that your Spring Boot application will run on
EXPOSE 8080

COPY ./target/api.jar api.jar

# Specify the command to run on container startup
ENTRYPOINT ["java", "-jar", "api.jar"]