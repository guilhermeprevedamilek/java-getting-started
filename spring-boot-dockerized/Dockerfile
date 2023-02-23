# Multi Stage build

# Base Image and name stage as "builder"
FROM maven:3-openjdk-17 AS builder

# Create App Directory inside our container
WORKDIR /guilherme/app/src/

# Copy files
COPY src ./
COPY pom.xml ../

RUN mvn -f /guilherme/app/pom.xml clean package

#### 2nd Stage ####

FROM openjdk:17.0.1

WORKDIR /guilherme/lib/

COPY --from=builder /guilherme/app/target/spring-boot-dockerized-0.0.1-SNAPSHOT.jar ./sb-dockerized.jar

# Expose the port to the inner container communication network
EXPOSE 3100

# Run the Java Application
ENTRYPOINT [ "java", "-jar", "/guilherme/lib/sb-dockerized.jar" ]