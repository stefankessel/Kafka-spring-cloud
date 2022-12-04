package com.stefan.data.dataproducer.controllers;

import com.stefan.data.dataproducer.exceptions.NotFoundException;
import com.stefan.data.dataproducer.models.NotFoundExceptionModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {

    Logger log = LoggerFactory.getLogger(ExceptionController.class);

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler({NotFoundException.class})
    public NotFoundExceptionModel handleNotFoundException(Throwable throwable){
        log.error("not found exception: " + throwable);

        return new NotFoundExceptionModel(throwable.getMessage());
    }
}
