package com.stefan.data.dataproducer.controllers;

import com.stefan.data.dataproducer.models.WikimediaData;
import com.stefan.data.dataproducer.services.WikimediaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataController {

    private final WikimediaService wikimediaService;

    public DataController(WikimediaService wikimediaService) {
        this.wikimediaService = wikimediaService;
    }

    @GetMapping("/wikimedia-data/{id}")
    public WikimediaData getWikimediaData(@PathVariable("id") Long id){
        return wikimediaService.getDataById(id);
    }

    @GetMapping("/wikimedia-data")
    public List<WikimediaData> getAll(){
        return wikimediaService.getAll();
    }
}
