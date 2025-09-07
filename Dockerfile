FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY src ./src

RUN javac src/*.java -d .

CMD ["java", "Main"]
