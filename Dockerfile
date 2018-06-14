FROM java:8-alpine
VOLUME /payment-receiver-service
ADD payment-receiver-service/target/payment-receiver-service-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch app.jar'
EXPOSE 9091
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=docker","-jar","/app.jar"]
