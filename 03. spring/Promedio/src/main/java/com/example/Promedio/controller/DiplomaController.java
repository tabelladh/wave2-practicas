package com.example.Promedio.controller;



import com.example.Promedio.dto.AlumnoDTO;
import com.example.Promedio.dto.DiplomaDTO;
import com.example.Promedio.service.DiplomaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DiplomaController {
    private final DiplomaService diplomaService;

    @Autowired
    public DiplomaController(DiplomaService diplomaService) {
        this.diplomaService = diplomaService;
    }

    @PostMapping("/diploma")
    public DiplomaDTO crearDiploma(@RequestBody AlumnoDTO alumno) {
        return diplomaService.generarDiploma(alumno);
    }
}