package com.stefan.kafka.kafka.producer.web.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic getTopic(){
        return TopicBuilder.name(String.valueOf(KafkaTopics.wikimedia_recentchange)).build();
    }
}
