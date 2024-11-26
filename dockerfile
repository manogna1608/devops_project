# Use an official OpenJDK runtime as a base image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the Java program to the container
COPY Factorial.java .

# Compile the Java program
RUN javac Factorial.java

# Run the Java program
CMD ["java", "Factorial"]

