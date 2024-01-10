FROM adoptopenjdk/openjdk17:alpine-slim

WORKDIR /app

COPY target/spring-boot-jpa-h2-0.0.1-SNAPSHOT.jar /app/app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
