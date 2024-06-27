package com.example.Joyeria.controller;

import com.example.Joyeria.DTO.RespuestaDTO;
import com.example.Joyeria.model.Joya;
import com.example.Joyeria.service.IJoyaService;
import com.example.Joyeria.service.JoyaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/jewerly")
public class JoyaController {

    @Autowired
    private IJoyaService joyaService;

    @GetMapping("/listar")
    public ResponseEntity<List<Joya>> listarJoyas() {
        return new ResponseEntity<>(joyaService.listarJoyas(), HttpStatus.OK);
    }

    @GetMapping("/traerporid/{id}")
    public ResponseEntity<Joya> traerJoya(@PathVariable Integer id) {
        return new ResponseEntity<>(joyaService.traerJoyaPorid(id), HttpStatus.OK);
    }

    @PostMapping("/new")
    public ResponseEntity<RespuestaDTO>  crearJoya(@RequestBody Joya joya) {
        return new ResponseEntity<>(joyaService.crearJoya(joya), HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<RespuestaDTO> actualizarJoya(@PathVariable Integer id, @RequestBody Joya joya) {
        return new ResponseEntity<>(joyaService.save(id, joya), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<RespuestaDTO> eliminarJoya(@PathVariable Integer id) {
        return new ResponseEntity<>(joyaService.eliminarJoyas(id), HttpStatus.OK);
    }
}
