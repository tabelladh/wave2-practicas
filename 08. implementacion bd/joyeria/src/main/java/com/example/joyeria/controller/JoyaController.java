package com.example.joyeria.controller;

import com.example.joyeria.model.Joya;
import com.example.joyeria.service.IjoyaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class JoyaController {

    @Autowired
    IjoyaService service;

    @GetMapping("/jewerly")
    public ResponseEntity<?>listar(){
        return new ResponseEntity<>(service.listar(), HttpStatus.OK);
    }

    @PostMapping("/jewerly/new")
    public ResponseEntity<?>crear(@RequestBody Joya joya){
        return new ResponseEntity<>(service.crear(joya),HttpStatus.CREATED);
    }

    @PutMapping("/jewerly/update/{id_modificar}")
    public ResponseEntity<?>actualizar(@PathVariable Long id_modificar,
                                       @RequestBody Joya joya){
        return new ResponseEntity<>(service.actualizar(id_modificar,joya),HttpStatus.OK);
    }

    @DeleteMapping("/jewerly/delete/{id}")
    public ResponseEntity<?>borrar(@PathVariable Long id){
        return new ResponseEntity<>(service.borrar(id),HttpStatus.NO_CONTENT);
    }
}
