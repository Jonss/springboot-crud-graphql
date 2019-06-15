FROM openjdk:8-jdk-alpine

RUN mkdir /graphql-sample

COPY build/libs/graphql-crud-sample-0.0.1-SNAPSHOT.jar /graphql-sample/app.jar

WORKDIR /graphql-sample

CMD ["sh", "-c", "java -Dspring.profiles.active=$JAVA_ENV -jar app.jar"]