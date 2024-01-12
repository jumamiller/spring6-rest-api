FROM eclipse-temurin:21
ADD target/tickets-0.0.1-SNAPSHOT.jar tickets.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","tickets.jar"]