package com.example.joyeria.controller;

import com.example.joyeria.DTO.JoyaDTO;
import com.example.joyeria.DTO.ResponseDTO;
import com.example.joyeria.model.Joya;
import com.example.joyeria.service.IJoyaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jewerly")
public class JoyaController {

    @Autowired
    private IJoyaService joyaService;

    @PostMapping("/new")
    public ResponseEntity<ResponseDTO> agregarJoya(@RequestBody JoyaDTO joyaDTO){
        return new ResponseEntity<>(joyaService.agregarJoya(joyaDTO), HttpStatus.CREATED);
    }

}
