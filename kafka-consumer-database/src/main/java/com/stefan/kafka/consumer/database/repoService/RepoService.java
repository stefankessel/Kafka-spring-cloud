package com.stefan.kafka.consumer.database.repoService;

import com.stefan.kafka.consumer.database.model.WikimediaEntity;
import com.stefan.kafka.consumer.database.repository.WikimediaRepo;
import org.springframework.stereotype.Service;

//@Service
public class RepoService {

    WikimediaRepo wikimediaRepo;

    RepoService(WikimediaRepo wikimediaRepo){
        this.wikimediaRepo = wikimediaRepo;
    }

    public void safeKafkaEventMessage(String eventMessage){
        WikimediaEntity wikimediaEntity = new WikimediaEntity();
        wikimediaEntity.setEventData(eventMessage);

        this.wikimediaRepo.save(wikimediaEntity);
    }
}
