package com.example.demo.Controller;

import com.example.demo.DTO.AlumnoDTO;
import com.example.demo.DTO.RespuestaDTO;
import com.example.demo.Service.IAlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlumnoController {

    //inyectar la dependencia
    @Autowired
    private IAlumnoService alumnoService;

    @PostMapping("/CalcularPromedio")
    public ResponseEntity<RespuestaDTO> agregarAlumno(@RequestBody AlumnoDTO alumnoDTO){
        return new ResponseEntity<>(alumnoService.calcularPromedio(alumnoDTO), HttpStatus.OK);
    }

/*
    @GetMapping("/listarAlumnos")
    public ResponseEntity<List<AlumnoDTO>> listarAlumnos(){
        return new ResponseEntity<>(alumnoService.listarAlumnos(), HttpStatus.OK);
    }
*/


}
