package com.example.JoyeriaLasPerlas.Controller;

import com.example.JoyeriaLasPerlas.DTO.RespuestaDTO;
import com.example.JoyeriaLasPerlas.Model.Joya;
import com.example.JoyeriaLasPerlas.Service.IJoyaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class joyaController {
    @Autowired
    private IJoyaService joyaService;

    @PostMapping("/create")
    public ResponseEntity<RespuestaDTO> crearJoya(@RequestBody Joya joya){
        return new ResponseEntity<>(joyaService.saveJoya(joya), HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Joya>> listarJoyas() {
        return new ResponseEntity<>(joyaService.getJoyas(), HttpStatus.OK);
    }

    @GetMapping("/findJoya/{id}")
    public ResponseEntity<Joya> getJoya(@PathVariable Integer id) {
        return new ResponseEntity<>(joyaService.getJoya(id), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<RespuestaDTO> updateJoya(@PathVariable Integer id, @RequestBody Joya joya) {
       return new ResponseEntity<>(joyaService.updateJoya(joya, id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<RespuestaDTO> deleteJoya(@PathVariable Integer id) {
        return new ResponseEntity<>(joyaService.deleteJoya(id), HttpStatus.OK);
    }

}
