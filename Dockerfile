FROM openjdk:21-jdk-slim
LABEL authors="antonhorobets"

EXPOSE 8080

ARG JAR_FILE=build/libs/demo1-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]