package com.example.Ejercicio01.controller;

import com.example.Ejercicio01.dto.AlumnoDTO;
import com.example.Ejercicio01.service.IAlumnoPromedio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AlumnoController {
    //inyectar la dependecia

    @Autowired
    IAlumnoPromedio alumnoService;



    @PostMapping("/alumno")
    public ResponseEntity<?> obtenerPromedio(@RequestBody AlumnoDTO alumno){

        return new ResponseEntity<>(alumnoService.calcularPromedio(alumno.getCalificaciones()), HttpStatus.OK);
    }
}
