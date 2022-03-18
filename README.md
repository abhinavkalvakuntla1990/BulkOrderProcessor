# Microservice Description

The idea of this service is to be able to consume the messages for the bulk orders processing and to save in the orders Service by interfacing via rest API.

Using Apache Kafka for handling async communication from the bulk order clients.


# Steps to run the application 


## using Docker Compose
 
 **Pre Requisite:** 
  Install Docker Compose or have Docker Desktop running.


1. Navigate to root folder of the project `/BulkOrderProcessor`
2. Run the following command `./gradlew clean build`
3. Navigate to src/main/docker directory
4. Copy the jar `bulk-order-processor-1.0.jar` file from /build/libs/ to src/main/docker
5. Run the following command `docker-compose build` this is to build the image for the Jar generated.
6. Run the following command `docker-compose up` to run the image.
7. In the console you should see the application to be running on port 8080.
8. You can access the swagger using `http://localhost:8081/bulk-order/swagger-ui/index.html#/`
9. Kafka will also be running based on the configuration in the docker-compose file.


Note : This service exposes a Rest API to be able to produce message , which is just for the demo purpose but not part of the solution.