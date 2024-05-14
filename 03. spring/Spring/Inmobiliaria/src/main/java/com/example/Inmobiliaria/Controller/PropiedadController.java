package com.example.Inmobiliaria.Controller;

import com.example.Inmobiliaria.DTO.HabitacionesDTO;
import com.example.Inmobiliaria.DTO.PropiedadDTO;
import com.example.Inmobiliaria.Service.Propiedad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class PropiedadController {

    public final Propiedad service;

    @Autowired
    public PropiedadController(Propiedad service) {
        this.service = service;
    }


    @GetMapping("/calcularMetrosCuadrados")
    public ResponseEntity<Double> calcularMetrosCuadrados(@RequestBody PropiedadDTO propiedad) {
        Double metros = service.calcularMetrosCuadrados(propiedad);
        return ResponseEntity.ok(metros);
    }

    @GetMapping("/calcularValorPropiedad")
    public ResponseEntity<Double> calcularValorPropiedad(@RequestBody PropiedadDTO propiedad) {
        Double valor = service.calcularValorPropiedad(propiedad);
        return ResponseEntity.ok(valor);
    }

    @GetMapping("/habitacionMasGrande")
    public ResponseEntity<HabitacionesDTO> habitacionMasGrande(@RequestBody PropiedadDTO propiedad) {
        HabitacionesDTO habitacion = service.habitacionMasGrande(propiedad);
        return ResponseEntity.ok(habitacion);
    }

    @GetMapping("/calcularMetrosCuadradosPorHabitacion")
    public ResponseEntity<Map<String, Double>> calcularMetrosCuadradosPorHabitacion(@RequestBody PropiedadDTO propiedades) {
        Map<String, Double> metros = service.calcularMetrosCuadradosPorHabitacion(propiedades);
        return ResponseEntity.ok(metros);
    }
}
