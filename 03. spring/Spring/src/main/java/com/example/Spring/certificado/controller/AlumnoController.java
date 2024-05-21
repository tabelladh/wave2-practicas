package com.example.Spring.certificado.controller;

import com.example.Spring.certificado.dto.AlumnoDTO;
import com.example.Spring.certificado.model.Diploma;
import com.example.Spring.certificado.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlumnoController {

    @Autowired
    private final AlumnoService alumnoService;

    public AlumnoController(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    @PostMapping("/calcular_promedio")
    public ResponseEntity<Diploma> calcularPromedio(@RequestBody AlumnoDTO alumnoDTO) {
        return ResponseEntity.status(HttpStatus.OK).body(alumnoService.calcularPromedio(alumnoDTO));
    }
}
