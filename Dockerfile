FROM openjdk:8-jdk-alpine
WORKDIR ./src/school/
COPY ./src/school/App.java .
RUN javac App.java
CMD ["java", "App"]
