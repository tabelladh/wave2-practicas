package com.example.Ejercicio3_Promedio.Controller;

import com.example.Ejercicio3_Promedio.Service.AlumnoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PromedioController {

    @Autowired
    private AlumnoDTO AlumnoDTO;

    @GetMapping("/promedio")
    public double getPromedio(@RequestParam String nombre,
                              @RequestParam String apellido,
                              @RequestParam ArrayList<Double> calificaciones) {
        return AlumnoDTO.getPromedio(calificaciones);
    }
}
