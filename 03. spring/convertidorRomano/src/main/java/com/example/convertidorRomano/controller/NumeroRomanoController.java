package com.example.convertidorRomano.controller;

import com.example.convertidorRomano.service.NumeroRomanoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class NumeroRomanoController {

     private final NumeroRomanoService numeroRomanoService;

     @GetMapping("/{numero}")
    public String tuNumeroRomano(@PathVariable int numero){
        return numeroRomanoService.convertToRoman(numero);
    }

}
