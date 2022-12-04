package com.stefan.dataconsumer.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class MediaData implements Serializable {

    Long id;
    String data;

    public MediaData(Long id) {
        this.id = id;
    }
}
