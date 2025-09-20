FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY *.java .

RUN javac Adivinhacao.java

CMD ["java", "Adivinhacao"]