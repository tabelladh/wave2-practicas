package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRestController {

@GetMapping("/hello")
public String sayHello()
{   return "Hello World";   }

@RequestMapping("/hello/{name}")
public String sayHelloName(@PathVariable String name)
{   return "Hello World " + name;   }

@GetMapping("/hello2") //Esta version lo pide como parametro, no en la URL.
public String sayHello2(@RequestParam String name, @RequestParam String ape )
{   return ("Hello World (2) " + name + " " + ape) ;   }

}
