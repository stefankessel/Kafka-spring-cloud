package com.stefan.data.dataproducer.models;

public class NotFoundExceptionModel {

    String message;

    public NotFoundExceptionModel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
