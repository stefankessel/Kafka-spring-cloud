package com.stefan.kafka.consumer.database.consumerService;

import com.stefan.kafka.consumer.database.model.WikimediaEntity;
import com.stefan.kafka.consumer.database.repository.WikimediaRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    private final Logger LOG = LoggerFactory.getLogger(KafkaConsumerService.class);

    //private final RepoService repoService;
    private final WikimediaRepo wikimediaRepo;

    public KafkaConsumerService(WikimediaRepo wikimediaRepo) {
        this.wikimediaRepo = wikimediaRepo;
    }


    @KafkaListener(
            topics = "wikimedia_recentchange",
            groupId = "myConsumerGroup"
    )

    public void consume(String message){
        LOG.info("kafka event message: " + message);

        //repoService.safeKafkaEventMessage(message);
        WikimediaEntity wikimediaEntity = new WikimediaEntity();
        wikimediaEntity.setEventData(message);

        this.wikimediaRepo.save(wikimediaEntity);
    }
}
