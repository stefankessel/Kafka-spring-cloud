package com.stefan.kafka.kafka.producer.web.eventhandler;


import com.launchdarkly.eventsource.EventHandler;
import com.launchdarkly.eventsource.MessageEvent;
import com.stefan.kafka.kafka.producer.web.service.KafkaChangesProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;

public class KafkaEventHandler implements EventHandler {

    private static final Logger LOG = LoggerFactory.getLogger(KafkaChangesProducer.class);

    KafkaTemplate<String, String> kafkaTemplate;
    String topic;

    public KafkaEventHandler(KafkaTemplate<String, String> kafkaTemplate, String topic) {
        this.kafkaTemplate = kafkaTemplate;
        this.topic = topic;
    }

    @Override
    public void onOpen() throws Exception {

    }

    @Override
    public void onClosed() throws Exception {

    }

    @Override
    public void onMessage(String s, MessageEvent messageEvent) throws Exception {
        LOG.info("Kafka message event: " + messageEvent.getData());

        // send message to topic
        kafkaTemplate.send(topic, messageEvent.getData());
    }

    @Override
    public void onComment(String s) throws Exception {

    }

    @Override
    public void onError(Throwable throwable) {

    }
}
