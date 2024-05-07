package com.example.certificado.controller;

import com.example.certificado.model.AlumnoDTO;
import com.example.certificado.service.IAlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlumnoController {

    @Autowired
    IAlumnoService alumnoService;

    @PostMapping("/alumno")
    public ResponseEntity<?> obtenerPromedio(@RequestBody AlumnoDTO alumno){

        return new ResponseEntity<>(alumnoService.calcularPromedio(alumno.getCalificaciones()), HttpStatus.OK);
    }

}
