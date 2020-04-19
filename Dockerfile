From openjdk:8

copy ./target/worker-api-0.0.1-SNAPSHOT.jar worker-api-0.0.1-SNAPSHOT.jar

CMD ["java","-jar","worker-api-0.0.1-SNAPSHOT.jar"]