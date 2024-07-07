package com.visitscotland.wishlist.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class exceptionControllerAdvice {

    @ExceptionHandler(value =customException.class)
    public final ResponseEntity<String> handleCustomException(customException exp){
        return new ResponseEntity<>(exp.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
