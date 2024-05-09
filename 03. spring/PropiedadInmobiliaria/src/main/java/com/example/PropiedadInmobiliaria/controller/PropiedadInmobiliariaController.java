package com.example.PropiedadInmobiliaria.controller;

import java.util.Map;
import java.util.stream.Collectors;

import com.example.PropiedadInmobiliaria.DTO.HabitacionDTO;
import com.example.PropiedadInmobiliaria.DTO.PropiedadInmobiliariaDTO;
import com.example.PropiedadInmobiliaria.model.Habitacion;
import com.example.PropiedadInmobiliaria.model.PropiedadInmobiliaria;
import com.example.PropiedadInmobiliaria.service.PropiedadInmobiliariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/propiedades")
public class PropiedadInmobiliariaController {
    private final PropiedadInmobiliariaService propiedadService;

    @Autowired
    public PropiedadInmobiliariaController(PropiedadInmobiliariaService propiedadService) {
        this.propiedadService = propiedadService;
    }

    @PostMapping("/calcular-metros-cuadrados")
    public ResponseEntity<Double> calcularMetrosCuadradosTotal(@RequestBody PropiedadInmobiliariaDTO propiedadDTO) {
        PropiedadInmobiliaria propiedad = convertirAPropiedad(propiedadDTO);
        double metrosCuadrados = propiedadService.calcularMetrosCuadradosTotal(propiedad);
        return ResponseEntity.ok(metrosCuadrados);
    }

    @PostMapping("/valor-propiedad")
    public ResponseEntity<Double> calcularValorPropiedad(@RequestBody PropiedadInmobiliariaDTO propiedadDTO) {
        PropiedadInmobiliaria propiedad = convertirAPropiedad(propiedadDTO);
        double valorPropiedad = propiedadService.calcularValorPropiedad(propiedad);
        return ResponseEntity.ok(valorPropiedad);
    }

    @PostMapping("/habitacion-mas-grande")
    public ResponseEntity<HabitacionDTO> encontrarHabitacionMasGrande(@RequestBody PropiedadInmobiliariaDTO propiedadDTO) {
        PropiedadInmobiliaria propiedad = convertirAPropiedad(propiedadDTO);
        HabitacionDTO habitacionMasGrande = propiedadService.encontrarHabitacionMasGrande(propiedad);
        return ResponseEntity.ok(habitacionMasGrande);
    }

    @PostMapping("/metros-cuadrados-por-habitacion")
    public ResponseEntity<Map<String, Double>> calcularMetrosCuadradosPorHabitacion(@RequestBody PropiedadInmobiliariaDTO propiedadDTO) {
        PropiedadInmobiliaria propiedad = convertirAPropiedad(propiedadDTO);
        Map<String, Double> metrosCuadradosPorHabitacion = propiedadService.calcularMetrosCuadradosPorHabitacion(propiedad);
        return ResponseEntity.ok(metrosCuadradosPorHabitacion);
    }

    private PropiedadInmobiliaria convertirAPropiedad(PropiedadInmobiliariaDTO propiedadDTO) {
        PropiedadInmobiliaria propiedad = new PropiedadInmobiliaria();
        propiedad.setNombre(propiedadDTO.getNombre());
        propiedad.setDireccion(propiedadDTO.getDireccion());
        propiedad.setHabitaciones(propiedadDTO.getHabitaciones().stream()
                .map(this::convertirAHabitacion)
                .collect(Collectors.toList()));
        return propiedad;
    }

    private Habitacion convertirAHabitacion(HabitacionDTO habitacionDTO) {
        Habitacion habitacion = new Habitacion();
        habitacion.setNombre(habitacionDTO.getNombre());
        habitacion.setAncho(habitacionDTO.getAncho());
        habitacion.setLargo(habitacionDTO.getLargo());
        return habitacion;
    }

    }


