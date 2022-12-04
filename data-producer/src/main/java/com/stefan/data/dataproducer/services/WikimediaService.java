package com.stefan.data.dataproducer.services;

import com.stefan.data.dataproducer.exceptions.NotFoundException;
import com.stefan.data.dataproducer.models.WikimediaData;
import com.stefan.data.dataproducer.repository.WikimediaDataRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WikimediaService {

    private final WikimediaDataRepo wikimediaDataRepo;

    public WikimediaService(WikimediaDataRepo wikimediaDataRepo) {
        this.wikimediaDataRepo = wikimediaDataRepo;
    }

    public WikimediaData getDataById(Long id){
        WikimediaData result = wikimediaDataRepo.findById(id).orElseThrow( () -> new NotFoundException("Dataset not found"));

        return result;
    }

    public List<WikimediaData> getAll() {
         List<WikimediaData> data = wikimediaDataRepo.findAll();
         return data;
    }
}
