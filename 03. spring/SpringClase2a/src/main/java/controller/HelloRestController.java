package controller;

import org.springframework.web.bind.annotation.*;
import service.INumRomanos;

@RestController
@RequestMapping("/romanos")
public class HelloRestController {


    private final INumRomanos numRomanos;

    public HelloRestController(INumRomanos numRomanos) {
        this.numRomanos = numRomanos;
    }


    @RequestMapping(value = "/{numDecimal}", method = RequestMethod.GET) // @RequestMapping es mas general
    public String decimal(@PathVariable Integer numDecimal) {
        return numRomanos.transformarARomanos(numDecimal);
    }



}

