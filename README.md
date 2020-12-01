# spring-boot-kafka-producer
Spring boot kafka producer web application that does following:
  Sets up a REST endpoint (POST: http://localhost:8080/swagger-ui.html#/message-publish-controller/postCustomerToKafkaUsingPOST)
  Exposes and documents that REST endpoint using Swagger API
  Publishes the Customer object that is obtained from the REST endpoint to a Kafka Topic "Customer" to a local kafka broker
