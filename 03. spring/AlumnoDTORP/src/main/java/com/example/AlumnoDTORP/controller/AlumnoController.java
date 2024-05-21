package com.example.AlumnoDTORP.controller;

import com.example.AlumnoDTORP.dto.AlumnoDTO;
import com.example.AlumnoDTORP.dto.RespuestaDTO;
import com.example.AlumnoDTORP.service.IAlumnoService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alumno")
@Validated
public class AlumnoController {

    //inyectar la dependencia
    @Autowired
    private IAlumnoService alumnoService;

    @GetMapping("/listarAlumnos") // el parametro <?> reemplaza el tipo de dato de el metodo
    public ResponseEntity<List<AlumnoDTO>> listarAlumnos(){
        return new ResponseEntity<>(alumnoService.listarAlumnos(), HttpStatus.OK);
    }

    @GetMapping("/listarAlumno/{id}")
    public ResponseEntity<AlumnoDTO> buscarPorId(@PathVariable
                                                     @Positive(message = "El id debe ser positivo y distinto a 0")
                                                     @NotNull(message = "El id no puede ser nulo") Integer id){
        return new ResponseEntity<>(alumnoService.buscarPorId(id), HttpStatus.OK);
    }

    @PostMapping("/agregarAlumno")
    public ResponseEntity<RespuestaDTO> agregarAlumno(@RequestBody @Valid AlumnoDTO alumnoDTO){
        return new ResponseEntity<>(alumnoService.agregarAlumno(alumnoDTO), HttpStatus.CREATED);
    }

    @DeleteMapping("/borrarAlumno/{id}")
    public ResponseEntity<RespuestaDTO> borrarAlumno(@PathVariable Integer id){
        return new ResponseEntity<>(alumnoService.borrarAlumno(id), HttpStatus.OK);
    }

    @PutMapping("/actualizarAlumno")
    public ResponseEntity<AlumnoDTO> actualizarAlumno(@RequestBody AlumnoDTO alumnoDTO){
        return new ResponseEntity<>(alumnoService.actualizarAlumno(alumnoDTO), HttpStatus.OK);
    }

    @GetMapping("/existeAlumno/{id}")
    public ResponseEntity<Boolean> existeAlumno(@PathVariable Integer id){
        return new ResponseEntity<>(alumnoService.existeAlumno(id), HttpStatus.OK);
    }
}
