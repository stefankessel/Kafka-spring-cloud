package com.stefan.kafka.kafka.producer.web;

import com.stefan.kafka.kafka.producer.web.service.KafkaChangesProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProducerApplication implements CommandLineRunner {

    @Autowired
    private KafkaChangesProducer kafkaChangesProducer;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootProducerApplication.class);
    }
    // runs when application boots up
    @Override
    public void run(String... args) throws Exception {
        kafkaChangesProducer.sendMessage();
    }
}
