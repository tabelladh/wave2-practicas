package com.example.CalculadoraEdades.controller;


import com.example.CalculadoraEdades.service.CalculadoraEdadServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraEdad {

    @Autowired
    private CalculadoraEdadServiceImpl service;

    /*@Autowired
    public CalculadoraEdad(CalculadoraEdadServiceImpl service) {
        this.service = service;
    }*/

    @GetMapping("/{dia}/{mes}/{anio}")
    public Integer calcularEdad(@PathVariable int dia, @PathVariable int mes,  @PathVariable int anio) {
        int edad = service.calcularEdad(dia, mes, anio);
        return edad;
    }




}
