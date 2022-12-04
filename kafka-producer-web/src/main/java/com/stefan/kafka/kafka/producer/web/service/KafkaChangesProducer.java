package com.stefan.kafka.kafka.producer.web.service;

import com.launchdarkly.eventsource.EventHandler;
import com.launchdarkly.eventsource.EventSource;
import com.stefan.kafka.kafka.producer.web.config.KafkaTopics;
import com.stefan.kafka.kafka.producer.web.eventhandler.KafkaEventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.util.concurrent.TimeUnit;

@Service
public class KafkaChangesProducer {

    Logger LOG = LoggerFactory.getLogger(KafkaChangesProducer.class);

    private KafkaTemplate kafkaTemplate;

    public KafkaChangesProducer(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage() throws InterruptedException {
        String topic = String.valueOf(KafkaTopics.wikimedia_recentchange);

        EventHandler eventHandler = new KafkaEventHandler(this.kafkaTemplate, topic);

        String uri = "https://stream.wikimedia.org/v2/stream/recentchange";
        EventSource.Builder builder = new EventSource.Builder(eventHandler, URI.create(uri));
        EventSource eventSource = builder.build();
        eventSource.start();

        TimeUnit.MINUTES.sleep(1);

    }
}
