FROM azul/zulu-openjdk:17-latest

WORKDIR /app

COPY build/libs/*.jar app.jar

EXPOSE 8085

ENTRYPOINT ["java", "-jar", "app.jar"]