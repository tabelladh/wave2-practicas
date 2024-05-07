package com.example.calcuEdad.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWord {

    @GetMapping("/hello") //@GetMapping es especifico del metodo get
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/hello/{name}") //Se envia el name por la URL
    public String sayHello(@PathVariable String name) {
        return "Hello World " + name;
    }

    @GetMapping("/hello/{name}/{apellido}/{edad}") //Se envia el name por parametro
    public String sayHello(@PathVariable String name,
                            @PathVariable String apellido,
                            @PathVariable Integer edad) {
        return "Hello World" +
                "Tu nombre es: "+ name +
                ", Tu apellido es: " + apellido +
                " y tenes: " + edad;

    }
}
