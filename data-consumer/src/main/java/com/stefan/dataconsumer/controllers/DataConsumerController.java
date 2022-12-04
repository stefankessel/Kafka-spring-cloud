package com.stefan.dataconsumer.controllers;

import com.stefan.dataconsumer.models.MediaData;
import com.stefan.dataconsumer.proxy.DataConsumerFeignProxy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataConsumerController {

    private final DataConsumerFeignProxy feignProxy;

    public DataConsumerController(DataConsumerFeignProxy feignProxy) {
        this.feignProxy = feignProxy;
    }

    @GetMapping("/media-consumer/{id}")
    public MediaData getMediaData(@PathVariable("id") Long id){
        final MediaData responseData = feignProxy.getWikimediaData(id);
        // TODO Fix wikimediaData format
        return new MediaData(responseData.getId());

    }
}
