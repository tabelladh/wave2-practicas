package com.example.demoDto.controller;

import com.example.demoDto.dto.AlumnoDto;
import com.example.demoDto.service.IAlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlumoController {

    @Autowired
    private IAlumnoService alumnoService;

    public ResponseEntity<?>listar(){
        return new ResponseEntity<>(alumnoService.listar(),HttpStatus.OK);
    }

    @PostMapping("/alumno")
    public ResponseEntity<AlumnoDto> agregarAlumno(@PathVariable AlumnoDto alumnoDto){
        return new ResponseEntity<>(alumnoService.agregar(alumnoDto), HttpStatus.CREATED);
    }
}
