package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DemoController {

    @GetMapping("/demo")
    public String index(){
        return "Welcome from secure endpoint 1";
    }

    @GetMapping("/index2")
    public String index2(){
        return "Welcome from a Not SECURED endpoint!";
    }
}
