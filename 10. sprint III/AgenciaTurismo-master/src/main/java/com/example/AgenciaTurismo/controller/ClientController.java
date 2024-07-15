package com.example.AgenciaTurismo.controller;


import com.example.AgenciaTurismo.dto.ClienteDTO;
import com.example.AgenciaTurismo.model.Client;
import com.example.AgenciaTurismo.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/clients")
public class ClientController {

    @Autowired
    IClientService clientService;

    @GetMapping("/top3")
    ResponseEntity<List<ClienteDTO>> topClientes(){
        return new ResponseEntity<>(clientService.topClientes(), HttpStatus.OK);
    }

    @GetMapping
    ResponseEntity<List<Client>> listarClientes(){
        return new ResponseEntity<>(clientService.listarClientes(), HttpStatus.OK);
    }

    @GetMapping("/{userName}")
    ResponseEntity<ClienteDTO> findByUsername(@PathVariable String userName){
        return new ResponseEntity<>(clientService.findByUsername(userName), HttpStatus.OK);
    }
}
