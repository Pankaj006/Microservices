FROM adoptopenjdk/openjdk11:debian-slim
COPY  target/address-service-0.0.1-SNAPSHOT.jar /tmp
WORKDIR /tmp
CMD ["java","-jar","address-service-0.0.1-SNAPSHOT.jar"]