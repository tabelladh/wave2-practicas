package com.example.promedio.controller;

import com.example.promedio.dto.RespuestaDTO;
import com.example.promedio.model.Alumno;
import com.example.promedio.service.IAlumno;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AlumnoController {

    private final IAlumno alumnoPromedio;

    public AlumnoController(IAlumno alumnoPromedio) {
        this.alumnoPromedio = alumnoPromedio;
    }

    @PostMapping ("/alumnoPromedio")
    public ResponseEntity<RespuestaDTO> alumnoPromedio(@RequestBody  Alumno alumno) {
        return new ResponseEntity<>(alumnoPromedio.calcularPromedio(alumno), HttpStatus.OK);
    }
}
