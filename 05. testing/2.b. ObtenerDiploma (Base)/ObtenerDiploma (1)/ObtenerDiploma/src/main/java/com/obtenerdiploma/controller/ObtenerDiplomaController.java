package com.obtenerdiploma.controller;

import com.obtenerdiploma.dto.StudentWithMessageDTO;
import com.obtenerdiploma.service.IObtenerDiplomaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ObtenerDiplomaController {

    @Autowired
    IObtenerDiplomaService service;

    @GetMapping("/analyzeScores/{studentId}")
    public ResponseEntity<StudentWithMessageDTO> analyzeScores(@PathVariable Long studentId) {
        return ResponseEntity.ok(service.analyzeScores(studentId));
    }
}
