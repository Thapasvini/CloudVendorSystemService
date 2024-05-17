package com.cloudVendor.restproject.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
// coz this will handle all the exceptions rather golbally
// we can write all the expection handler in this class
public class CloudVendorExceptionHandler {


    @ExceptionHandler(value={CloudVendorNotFoundException.class})
    // if u want to add more class write after comma in brackets
    public ResponseEntity<Object> handleCloudVendorNotFoundException
            (CloudVendorNotFoundException cloudVendorNotFoundException)
    {
        CloudVendorException c= new CloudVendorException
                (cloudVendorNotFoundException.getMessage(),
                        cloudVendorNotFoundException.getCause(),
                        HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(c,HttpStatus.NOT_FOUND);
    }
}
