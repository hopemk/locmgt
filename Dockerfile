 FROM openjdk:8
EXPOSE 8080
ADD target/locationmgt-0.0.1-SNAPSHOT.jar locationmgt-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","locationmgt-0.0.1-SNAPSHOT.jar","--server.port=8080"]
