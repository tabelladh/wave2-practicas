package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRestController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }

    @RequestMapping("/hello/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello " + name;
    }

    @GetMapping("/hello2")
    public String sayHello2(@RequestParam String name) {
        return "Hello " + name;
    }
}
