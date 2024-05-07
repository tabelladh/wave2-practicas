package com.example.wave2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class SaludoController {

    @GetMapping("/saludo")
    public String sayHello(){
        return "hola!!";
    }

    @GetMapping("/saludo/{name}")
    public String sayHelloName(@PathVariable String name){
        return "hola " + name;
    }

    @GetMapping("/saludo/{name}/{apellido}/{edad}")
    public String sayHelloName(@PathVariable String name,@PathVariable String apellido,@PathVariable int edad){
        return "hola " + name + " " + apellido +
                ". Tenes " + edad + " anios de edad";
    }
}
