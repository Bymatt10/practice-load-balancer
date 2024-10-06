FROM openjdk:21

WORKDIR /app

COPY target/ms-gateway-0.0.1-SNAPSHOT.jar /app/ms-gateway.jar


EXPOSE 8761

ENTRYPOINT ["java", "-jar", "/app/ms-gateway.jar"]
