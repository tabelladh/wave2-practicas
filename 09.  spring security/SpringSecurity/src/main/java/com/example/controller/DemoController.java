package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DemoController {

    @GetMapping("/helloUser")
    public String index(){
        return "Lo ven user y admin";
    }

    @GetMapping("/helloWorld")
    public String index2(){
        return "Lo ve cualquier usuario";
    }

    @GetMapping("/helloAdmin")
    public String index3(){
        return "Lo ve solo admin";
    }

}
