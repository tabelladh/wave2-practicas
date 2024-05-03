package com.numRomanos.ejercicioSpring.Controller;

import com.numRomanos.ejercicioSpring.Service.IRomano;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RomanoController {

    // Dos formas de hacer inyeccion de dependencias

//    @Autowired
//    private IRomano numRomanos;

    private final IRomano numRomanos;

    public RomanoController(IRomano numRomanos) {
        this.numRomanos = numRomanos;
    }

    // Tres formas de mappear
    // @RequestMapping es mas general

//    @RequestMapping(value = "/{numDecimal}", method = RequestMethod.GET)
//    public String decimal(@PathVariable Integer numDecimal) {
//        return numRomanos.transformarARomanos(numDecimal);
//    }

//    @GetMapping("/{numDecimal}")
//    public String decimal2(@PathVariable Integer numDecimal) {
//        return numRomanos.transformarARomanos(numDecimal);
//    }

    @GetMapping(path = "/numDecimal")
    public String decimal3(@RequestParam Integer numDecimal) {
        return numRomanos.transformarARomanos(numDecimal);
    }
}