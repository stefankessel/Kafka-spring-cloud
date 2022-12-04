package com.stefan.kafka.consumer.database.repository;

import com.stefan.kafka.consumer.database.model.WikimediaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WikimediaRepo extends JpaRepository<WikimediaEntity, Long> {


}
