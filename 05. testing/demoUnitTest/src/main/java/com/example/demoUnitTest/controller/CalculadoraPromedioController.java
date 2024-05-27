package com.example.demoUnitTest.controller;

import com.example.demoUnitTest.service.ICalculadoraPromedioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alumno")
public class CalculadoraPromedioController {

    @Autowired
    private ICalculadoraPromedioService calculadoraPromedioService;

    //SUMAR dos numeros
    @GetMapping("/sumar/{n1}/{n2}")
    public ResponseEntity<Double> sumar(@PathVariable Double n1, @PathVariable Double n2){
        return new ResponseEntity<>(calculadoraPromedioService.sumar(n1, n2), HttpStatus.OK);
    }

    @GetMapping("/promedio/{n1}/{n2}")
    public ResponseEntity<Double> promedio(@PathVariable Double n1, @PathVariable Double n2){
        return new ResponseEntity<>(calculadoraPromedioService.promedio(n1, n2), HttpStatus.OK);
    }

    @GetMapping("/promedioDeAlumno/{id}")
    public ResponseEntity<Double> promedioDeAlumno(@PathVariable Integer id){
        Double promedio = calculadoraPromedioService.promedioDeAlumno(id);
        return new ResponseEntity<>(promedio, HttpStatus.OK);
    }


}
