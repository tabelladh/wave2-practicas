package com.example.helloWorldd.Controller;
//Crear un controlador que maneje las solicitudes en el endpoint /hello.

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String helloWorld() {
        return "Holiss Mundo!";
    }

        @GetMapping("/hello/{name}")
    public String helloName(@PathVariable String name){
        return "Holiss " + name + "!";
    }

    @GetMapping("/hello/{name}/{surname}/{age}")
    public String helloPersonalized(@PathVariable String name, @PathVariable String surname, @PathVariable int age) {
        return "Hello World! Tu nombre es: " + name + ", tu apellido: " + surname + " y tienes " + age + " años ";
    }
}

