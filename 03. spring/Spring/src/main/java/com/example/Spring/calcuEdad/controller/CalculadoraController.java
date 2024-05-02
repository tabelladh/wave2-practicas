package com.example.Spring.calcuEdad.controller;

import com.example.Spring.calcuEdad.servicio.CalcuServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    private final CalcuServicio calcuServicio;

    @Autowired
    public CalculadoraController(CalcuServicio calcuServicio) {
        this.calcuServicio = calcuServicio;
    }

    @GetMapping("/{dia}/{mes}/{anio}")
    public String calcularEdad(@PathVariable int dia, @PathVariable int mes, @PathVariable int anio) {
        int edad = calcuServicio.calcularEdad(dia, mes, anio);
        return "La edad de la persona es: " + edad + " años.";
    }
}
