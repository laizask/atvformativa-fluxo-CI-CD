FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY *.java .

RUN javac Main.java

CMD ["sh", "-c", "java Main && tail -f /dev/null"]
