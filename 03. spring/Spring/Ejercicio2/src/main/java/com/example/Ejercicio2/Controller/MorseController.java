package com.example.Ejercicio2.Controller;
import com.example.Ejercicio2.Service.IMorse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MorseController {

    @Autowired
    private IMorse morseService;

    @GetMapping("/traducir")
    public String traducirCodigoMorse(@RequestParam("codigoMorse") String codigoMorse) {
        return morseService.traducirCodigoMorse(codigoMorse);
    }
}