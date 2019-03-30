# Spring Kafka Integration
Sample Application developed to demostrate the kafka producer and consumer implementation using spring framework

# Requirements to develop kafka client using spring
# Kafka Installation
Refer : https://medium.com/@Ankitthakur/apache-kafka-installation-on-mac-using-homebrew-a367cdefd273
Make sure to create topic named *test*. *test* topic is used in application send and consume messages

# Kafka Server Configuration
Spring Boot Application can be configured in many ways. I have used application.yml configuration file to provide kafka server details. Following is the application.yml content
```
server.port: 9090
spring:
    kafka:
        consumer:
            bootstrap-servers: 127.0.0.1:9092
            group-id: 1
            auto-offset-reset: earliest
            key-deserializer: org.apache.kafka.common.serialization.StringDeserializer
            value-deserializer: org.apache.kafka.common.serialization.StringDeserializer
        producer:
            bootstrap-servers: 127.0.0.1:9092
            key-serializer: org.apache.kafka.common.serialization.StringSerializer
            value-serializer: org.apache.kafka.common.serialization.StringSerializer
```

# Kafka Producer Implementation
Refer : DataProducer.java

# Kafka Consumer Implementation
Refer : DataConsumer.java

# Rest Endpoint to publish message

| Parameter | Value |
| ------ | ------ |
| Method | POST |
| Endpoint URL| */kafka/message/send* |
| Body | Message which needs to be pushed to tha kafka |

Usage
```
curl -X POST -d 'Hello World to the kafka' http://localhost:9090/kafka/message/send
```
