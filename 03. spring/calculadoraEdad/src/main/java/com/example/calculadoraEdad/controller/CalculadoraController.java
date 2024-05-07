package com.example.calculadoraEdad.controller;

import com.example.calculadoraEdad.service.CalculadoraService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CalculadoraController {

    CalculadoraService calculadoraService;

    @GetMapping("/{year}/{month}/{day}")
    public String calcular(int year,int month,int day){
        return calculadoraService.calcularEdad(year, month, day);
    }
}
