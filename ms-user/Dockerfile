FROM openjdk:21

WORKDIR /app

COPY target/ms-user-0.0.1-SNAPSHOT.jar /app/ms-user.jar


EXPOSE 8082

ENTRYPOINT ["java", "-jar", "/app/ms-user.jar"]
