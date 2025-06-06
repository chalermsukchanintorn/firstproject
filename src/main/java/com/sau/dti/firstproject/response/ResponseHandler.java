package com.sau.dti.firstproject.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {
    public static ResponseEntity<Object> generateResponse(String message, HttpStatus status, Object objectValue){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("message", message);
        map.put("data", objectValue);

        return new ResponseEntity<Object>(map, status);
    }
}
