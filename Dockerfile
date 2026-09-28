FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

COPY target/banco-facil-api-0.0.1-SNAPSHOT.jar app.jar

RUN addgroup -S app && adduser -S app -G app
USER app

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
