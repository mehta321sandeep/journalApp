# Stage 1: Build the JAR
FROM maven:3.8-openjdk-8 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Run the JAR
# Fixed: Swapped dead openjdk image for supported eclipse-temurin
FROM eclipse-temurin:8-jre-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
