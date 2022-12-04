package com.stefan.dataconsumer.proxy;

import com.stefan.dataconsumer.models.MediaData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "data-producer-service", url = "localhost:8000")
@FeignClient(name = "data-producer") //url from service registry
public interface DataConsumerFeignProxy {

    @GetMapping("/wikimedia-data/{id}")
    public MediaData getWikimediaData(@PathVariable("id") Long id);
}
