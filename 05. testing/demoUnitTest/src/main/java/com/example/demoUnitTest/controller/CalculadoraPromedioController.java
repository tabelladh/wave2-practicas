package com.example.demoUnitTest.controller;

import com.example.demoUnitTest.service.CalculadoraPromedioService;
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
   private CalculadoraPromedioService calculadoraPromedioService;

   @GetMapping("/sumar/{num1}/{num2}")
   public ResponseEntity<Double> sumar(@PathVariable Double num1, @PathVariable Double num2) {
      return new ResponseEntity<>(calculadoraPromedioService.sumar(num1, num2), HttpStatus.OK);
   }

   @GetMapping("/promedio/{num1}/{num2}")
   public ResponseEntity<Double> promedio(@PathVariable Double num1, @PathVariable Double num2) {
      return new ResponseEntity<>(calculadoraPromedioService.promedio(num1, num2), HttpStatus.OK);
   }

   @GetMapping("/promedioDelAlumno/{id}")
   public ResponseEntity<Double> promedioDelAlumno(@PathVariable Integer id) {
      return new ResponseEntity<>(calculadoraPromedioService.promedioDelAlumno(id), HttpStatus.OK);
   }
}
