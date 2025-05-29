# ------------ Stage 1: Build the JAR ------------
FROM maven:3.9.6-eclipse-temurin-17 AS build

# Set working directory
WORKDIR /app

# Copy Maven files first for dependency caching
COPY pom.xml .
COPY src ./src

# Package the application (skipping tests if needed)
RUN mvn clean package -DskipTests

# ------------ Stage 2: Run the App ------------
FROM eclipse-temurin:17-jre-alpine

# Set working directory inside container
WORKDIR /app

# Copy built JAR from the build stage
COPY --from=build /app/target/*.jar app.jar

# Expose port (change if your app uses a different one)
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
