package com.example.AlumnoDTORP.controller;

import com.example.AlumnoDTORP.dto.AlumnoDTO;
import com.example.AlumnoDTORP.dto.RespuestaDTO;
import com.example.AlumnoDTORP.service.IAlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlumnoController {

    //inyectar la dependencia
    @Autowired
    private IAlumnoService alumnoService;

    @PostMapping("/agregarAlumno")
    public ResponseEntity<RespuestaDTO> agregarAlumno(@RequestBody AlumnoDTO alumnoDTO){
        return new ResponseEntity<>(alumnoService.agregarAlumno(alumnoDTO), HttpStatus.CREATED);
    }

    @GetMapping("/listarAlumnos")
    public ResponseEntity<List<AlumnoDTO>> listarAlumnos(){
        return new ResponseEntity<>(alumnoService.listarAlumnos(), HttpStatus.OK);
    }



}
