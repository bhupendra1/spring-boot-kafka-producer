# spring-boot-kafka-producer
Spring boot kafka producer web application that does following:
  (1) Sets up a REST endpoint (POST: http://localhost:8080/swagger-ui.html#/message-publish-controller/postCustomerToKafkaUsingPOST)
  (2) Exposes and documents that REST endpoint using Swagger API
  (3) Publishes the Customer object that is obtained from the REST endpoint to a Kafka Topic "Customer" to a local kafka broker
