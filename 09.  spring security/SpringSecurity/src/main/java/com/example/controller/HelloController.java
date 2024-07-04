package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/helloWorld")
    public String helloWorld(){
        return "Welcome to the public route";
    }

    @GetMapping("/helloUser")
    public String helloUser(){
        return "Welcome to the User route";
    }

    @GetMapping("/helloAdmin")
    public String helloAdmin(){
        return "Welcome to the Admin route";
    }

}
