FROM openjdk:21

WORKDIR /app

COPY target/ms-service-0.0.1-SNAPSHOT.jar /app/ms-service.jar


EXPOSE 8081

ENTRYPOINT ["java", "-jar", "/app/ms-service.jar"]
