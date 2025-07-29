# Use a lightweight JDK 17 base image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app



# Copy the JAR into the container
COPY target/spring-boot-2-hello-world-1.0.2-SNAPSHOT.jar spring-boot-2-hello-world-1.0.2-SNAPSHOT.jar

# Expose the service port
EXPOSE 7000

# Run the application
ENTRYPOINT ["java", "-jar", "spring-boot-2-hello-world-1.0.2-SNAPSHOT.jar"]