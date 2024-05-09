package com.example.calcuEdad.Controller;

import com.example.calcuEdad.Service.CalculadoraEdadService;
import com.example.calcuEdad.Service.CalculadoraEdadServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraEdad {

    //inyeccion de dependencia
    @Autowired
    private CalculadoraEdadService calculadoraEdadService;

    //La otra forma de inyeccion de dependencia por CONSTRUCTOR Y es mejor para cuando hagamos Testing ;-)
    //private final CalculadoraEdadService calculadoraEdadService ;

    //public CalculadoraEdad(CalculadoraEdadService calculadoraEdadService){
    //    this.calculadoraEdadService = calculadoraEdadService;
    //}


    @GetMapping("/{diaNacimiento}/{mesNacimiento}/{anioNacimiento}")
    public Integer calculaEdad(@PathVariable Integer diaNacimiento, @PathVariable Integer mesNacimiento,@PathVariable Integer anioNacimiento){
      return calculadoraEdadService.calculaEdad(diaNacimiento,mesNacimiento,anioNacimiento);
    }

}
