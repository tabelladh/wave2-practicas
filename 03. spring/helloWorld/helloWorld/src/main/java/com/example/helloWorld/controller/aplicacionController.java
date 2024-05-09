package com.example.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class aplicacionController {

/*Ejercicio Nº 1
Crear una API que sea capaz de devolver el mensaje “Hello World” cuando se accede al endpoint localhost:8080/hello.
Utilizar para esto una clase controller, con la finalidad de respetar el patrón MVC. Por otro lado, utilizar el
método GET mediante la annotation @GetMapping para lograr que la respuesta sea a partir de la llegada de una
solicitud realizada por dicho método.

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }


/*Ejercicio Nº 2
A partir del Ejercicio Nº 1, agregar la posibilidad de que un usuario pueda enviar mediante la URL su nombre y que
la API le responda el mensaje “Hello World” pero personalizado. Por ejemplo: “Hello World Gustavo”.
Pista: Para poder resolver este ejercicio necesitás usar la annotation @PathVariable.

    @GetMapping("/hello/{nombre}")
    public String hello(@PathVariable String nombre) {
        return "Hello World " + nombre;
    }*/

/*Ejercicio Nº 3
A partir del Ejercicio Nº 2, incorporar un nuevo endpoint que permita recibir, además del nombre, dos parámetros
más: apellido y edad. A partir de esto, lograr que la API responda el siguiente mensaje: “Hello World! Tu nombre es:
<<Nombre enviado como parámetro>>, tu apellido es: <<Apellido enviado como parámetro>> y tenés <<edad enviada como
parámetro>> años”.

Pista: Para poder resolver estos ejercicios necesitás usar la annotation @PathVariable.*/

    @GetMapping("/hello/{nombre}/{apellido}/{edad}")
    public String hello(@PathVariable String nombre, @PathVariable String apellido, @PathVariable int edad) {
        return "Hello World! " + "Tu nombre es: " + nombre + "  tu apellido es: " + apellido + "  y tenés " + edad;
    }

 }
