
FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY *.java .

RUN javac Main.java Tarefas.java

CMD ["java", "Main"]
