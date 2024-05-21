package com.example.wave2.Controller;

import com.example.wave2.Service.INumRomanos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/primerEjemplo")
public class HelloRestController {

    //Hago la inyeccion de la dependencia INumRomanos para que spring cree una instancia de esa clase
    //Recordar que tambien se puede hacer por Setter , o con @Autowired:

    //@Autowired
    //private INumRomanos numRomanos;

    private final INumRomanos numRomanos;

    public HelloRestController(INumRomanos numRomanos) {
     this.numRomanos = numRomanos;
    }


    @RequestMapping(value = "/{numDecimal}", method = RequestMethod.GET) // @RequestMapping es mas general
    public String decimal(@PathVariable Integer numDecimal) {
        return numRomanos.transformarARomanos(numDecimal);
    }

    @GetMapping("/hello") //@GetMapping es especifico del metodo get
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/hello/{name}") //Se envia el name por la URL
    public String sayHello(@PathVariable String name) {
            return "Hello " + name;
    }

    @GetMapping("/hello2") //Se envia el name por parametro
    public String sayHello2(@RequestParam String name) {
            return "Hello " + name;
    }

}
