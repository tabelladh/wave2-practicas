package com.example.Ejercicio02.controller;


import com.example.Ejercicio02.Model.Habitacion;
import com.example.Ejercicio02.service.IPropiedadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PropiedadController {
    @Autowired
    private IPropiedadService propiedadService;

    @GetMapping("/propiedad")
    public Double totalMetrosCuadrados(@RequestBody List<Habitacion> habitacionList) {
        return propiedadService.totalMetrosCuadrados(habitacionList);
    }

    @GetMapping("/propiedadPrecio")
    public Double totalPrecio(@RequestBody List<Habitacion> habitacionList) {
        return propiedadService.precioTotalPropiedad(habitacionList);
    }

    @GetMapping("/habitacionMasGrande")
    public Habitacion habitacionMasGrande (@RequestBody List<Habitacion> habitacionList) {
        return propiedadService.habitacionMasGrande(habitacionList);
    }
}
