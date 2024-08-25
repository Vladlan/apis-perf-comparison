# Use a base image with Java 17
FROM openjdk:21-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the build artifacts from the host machine to the container
COPY ./build/libs/posts-api-0.0.1-SNAPSHOT.jar /app/posts-api.jar
COPY ./build/libs/posts-api-0.0.1-SNAPSHOT-plain.jar /app/posts-api-plain.jar

# Expose the port the application will run on
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "posts-api.jar"]