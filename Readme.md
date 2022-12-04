# Java Advanced Course - Final Project

### Microservice Application using Spring Cloud and Kafka

Application receives a Data-Stream from Wikimedia API and stores it a MySQL DB. Data is available through rest-endpoint.

### Services:
    -   Service-Registry- on Port 8761
    -   Data-Producer-Service on Port 8000
    -   Data-Consumer-Service on Port 8100
    -   Kafka Producer
    -   Kafka Consumer

### Get Started
1. install and run Kafka locally, see https://kafka.apache.org/quickstart
2. start local MySQL Database
3. start Kafka Producer Service
4. start Kafka Consumer Service
5. start Service Registry
6. start Data Producer Service && start Data Consumer Service

### Features
- messaging using Kafka
- JPA
- Feign instead of RestTemplate for microservice communication
- exception handling

### Todos
- exception handling for Data-Consumer-Service
- add API Gateway
- add config server
