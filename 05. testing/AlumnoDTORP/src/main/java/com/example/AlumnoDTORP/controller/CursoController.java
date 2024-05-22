package com.example.AlumnoDTORP.controller;

import com.example.AlumnoDTORP.dto.CursoDTO;
import com.example.AlumnoDTORP.dto.response.CursoDuracionDTO;
import com.example.AlumnoDTORP.service.ICursoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private ICursoService cursoService;

    @GetMapping("/listarCursos")
    public ResponseEntity<List<CursoDTO>> listarCursos(){
        return new ResponseEntity<>(cursoService.traerTodos(), HttpStatus.OK);

    }

    @GetMapping("/listarCursos/{id}")
    public ResponseEntity<CursoDTO> buscarPorId(@PathVariable Integer id){
        return new ResponseEntity<>(cursoService.traerPorId(id), HttpStatus.OK);
    }

    @GetMapping("/masHoras")
    public ResponseEntity<CursoDuracionDTO> traerCursoDeMasHoras(){
        return new ResponseEntity<>(cursoService.traerMasHoras(), HttpStatus.OK);

    }

    @PostMapping("/agregarCurso")
    public ResponseEntity<CursoDTO> agregarCurso(@RequestBody @Valid CursoDTO cursoDTO){
        return new ResponseEntity<>(cursoService.agregarCurso(cursoDTO), HttpStatus.CREATED);
    }

}
