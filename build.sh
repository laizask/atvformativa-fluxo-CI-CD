mkdir -p out
find . -name "*.java" > sources.txt
javac -d out @sources.txt