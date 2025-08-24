FROM openjdk:17-slim

WORKDIR /app

COPY . .

RUN javac -d out $(find . -name "*.java")

CMD ["java", "-cp", "out", "Main"]