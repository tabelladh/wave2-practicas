package com.example.demo.Controller;

import com.example.demo.Service.ITraduceMorse;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/morse")
public class MorseController {
    private final ITraduceMorse morse;

    public MorseController(ITraduceMorse morse) {
        this.morse = morse;
    }

    @GetMapping("/morse") //Esta version lo pide como parametro, no en la URL.
    public String traducirMorse(@RequestParam String morse)
    {   return this.morse.traducirMorse(morse);
    }
/*
@RequestMapping("/morse/{morse}")
public String sayHelloName(@PathVariable String morse)
{   return "Hello World " + morse;   }
*/

}
