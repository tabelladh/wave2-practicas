package com.example.joyeria.controller;

import com.example.joyeria.entity.Joya;
import com.example.joyeria.resquest.RespuestaDTO;
import com.example.joyeria.resquest.RespuestaJoyaDTO;
import com.example.joyeria.service.IJoyaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JoyaController {

    @Autowired
    IJoyaService joyaService;

    @GetMapping("/jewerly")
    public ResponseEntity<List<Joya>> listar() {
        return new ResponseEntity<>(joyaService.listarJoyas(), HttpStatus.OK);
    }

    @PostMapping("/jewerly/new")
    public ResponseEntity<RespuestaDTO> crear(@RequestBody Joya joya) {
        return new ResponseEntity<>(joyaService.crearJoya(joya), HttpStatus.CREATED);
    }

    @PutMapping("/jewerly/update/{id}")
    public ResponseEntity<RespuestaJoyaDTO> actualizar(@PathVariable Long id,
                                                       @RequestBody Joya joya) {
        return new ResponseEntity<>(joyaService.actualizarJoya(id, joya), HttpStatus.CREATED);
    }

    @DeleteMapping("/jewerly/delete/{id}")
        public ResponseEntity<RespuestaDTO> borrar(@PathVariable Long id) {
            return new ResponseEntity<>(joyaService.borrarJoya(id), HttpStatus.OK);
        }

}
