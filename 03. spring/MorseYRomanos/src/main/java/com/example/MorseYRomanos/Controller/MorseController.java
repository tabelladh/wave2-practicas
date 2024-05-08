package com.example.MorseYRomanos.Controller;


import com.example.MorseYRomanos.Service.IMorseTraductor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MorseController {
    private final IMorseTraductor morseTraductor;

    public MorseController(IMorseTraductor morseTraductor) {
        this.morseTraductor = morseTraductor;
    }
    @GetMapping("/traducir") //Se envia el nombre por parametro
    public String sayTraduccion(@RequestParam("codigoMorse") String codigoMorse){
        return morseTraductor.traducirAMorse(codigoMorse);
    }
}
