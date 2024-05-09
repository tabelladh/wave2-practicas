package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }

    @RequestMapping("/{numDecimal}")
    public String decimal(@PathVariable int numDecimal) {
        return NumRomanos.transformarARomanos(numDecimal);
    }


}
