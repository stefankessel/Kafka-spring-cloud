package com.stefan.data.dataproducer.repository;

import com.stefan.data.dataproducer.models.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WikimediaDataRepo extends JpaRepository<WikimediaData, Long> {

}
