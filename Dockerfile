FROM maven:3.9.2-eclipse-temurin-17

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean package

CMD ["java", "-cp", "target/adivinhacao-1.0-SNAPSHOT.jar", "jogoAdivinhacao"]