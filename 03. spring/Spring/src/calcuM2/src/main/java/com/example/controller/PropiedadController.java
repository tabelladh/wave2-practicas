package com.example.controller;

import com.example.model.Habitacion;
import com.example.model.Propiedad;
import com.example.service.PropiedadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/propiedad")

public class PropiedadController {

   public final PropiedadService propiedadService;

   @Autowired
   public PropiedadController(PropiedadService propiedadService) {
      this.propiedadService = propiedadService;
   }

   @GetMapping("/calcularArea")
   public double calcularArea(@RequestBody Propiedad propiedad) {
      return propiedadService.calcularArea(propiedad);
   }

   @GetMapping("/calcularValor")
   public double calcularValor(@RequestBody Propiedad propiedad) {
      return propiedadService.calcularValor(propiedad);
   }

   @GetMapping("/obtenerHabitacionMasGrande")
   public Habitacion habMasGrande(@RequestBody Propiedad propiedad) {
      return propiedadService.habMasGrande(propiedad);
   }

   @GetMapping("/calcularAreaPorHabitacion")
   public Map<String, Double> calcularAreaPorHabitacion(@RequestBody Propiedad propiedad) {
      return propiedadService.calcularAreaPorHabitacion(propiedad);
   }
}