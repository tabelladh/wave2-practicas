package com.example.HelloWorld.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String saludo(){
        return "Hello World!";
    }

    @GetMapping("/hello/{name}")
    public String saludoPersonalizado(@PathVariable String name){
        return "Hello World " + name + "!";
    }

    @GetMapping("/hello/{name}/{lastname}/{age}")
    public String saludoPersonalizado(@PathVariable String name, @PathVariable String lastname, @PathVariable Integer age){
        return "Hello World! Tu nombre es: " + name + ", " +
                "tu apellido es: " + lastname +
                "y tenés: " + age + " años";
    }
}
