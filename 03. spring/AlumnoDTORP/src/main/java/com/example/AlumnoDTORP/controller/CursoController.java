package com.example.AlumnoDTORP.controller;

import com.example.AlumnoDTORP.dto.CursoDTO;
import com.example.AlumnoDTORP.dto.CursoDuracionDTO;
import com.example.AlumnoDTORP.service.ICursoService;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cursos")
@Validated
public class CursoController {

    @Autowired
    private ICursoService cursoService;

    @GetMapping("/listarCursos")
    public ResponseEntity<List<CursoDTO>> listarCursos(){
        return new ResponseEntity<>(cursoService.traerTodos(), HttpStatus.OK);

    }

    @GetMapping("/listarCursos/{id}")
    public ResponseEntity<CursoDTO> buscarPorId(@PathVariable
                                                    @Positive(message = "El id debe ser positivo y distinto a 0")
                                                    @NotNull(message = "El id no puede ser nulo")
                                                    Integer id){
        return new ResponseEntity<>(cursoService.traerPorId(id), HttpStatus.OK);
    }

    @GetMapping("/masHoras")
    public ResponseEntity<CursoDuracionDTO> traerCursoDeMasHoras(){
        return new ResponseEntity<>(cursoService.traerMasHoras(), HttpStatus.OK);

    }

}
