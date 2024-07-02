package com.example.sorteo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public class TopicController {

    @GetMapping("/topics")
    public ResponseEntity<?>listar(){
        return new ResponseEntity<>();
    }
}
