package com.example.demo.Controller;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

//    @GetMapping("/hello")
//    public String sayHello() {
//        return "Hello World!";
//    }

//    @GetMapping (path = "/{name}")
//    public String sayHello(@PathVariable String name) {
//        return ("Hello " + name);
//    }

    @GetMapping (path = "/name/lastname/edad")
    public String sayHello(@RequestParam String name, @RequestParam String lastname, @RequestParam int edad) {
        return ("Hello " + name + " " + lastname + " tienes " + edad + " años");
    }
}
