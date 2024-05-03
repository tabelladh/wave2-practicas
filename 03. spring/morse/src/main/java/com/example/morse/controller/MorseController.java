package com.example.morse.controller;

import com.example.morse.service.MorseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MorseController {

    private final MorseService morseService;

    @GetMapping("/{texto}")
    public String traducir(@PathVariable String texto){
        return morseService.traductor(texto);
    }

}
