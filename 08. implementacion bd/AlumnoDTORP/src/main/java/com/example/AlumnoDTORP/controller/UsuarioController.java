package com.example.AlumnoDTORP.controller;

import com.example.AlumnoDTORP.dto.RespuestaDTO;
import com.example.AlumnoDTORP.dto.response.UsuarioDTO;
import com.example.AlumnoDTORP.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping("/listarUsuarios")
    public ResponseEntity<List<UsuarioDTO>> listarAlumnos(){
        return new ResponseEntity<>(usuarioService.listarUsuarios(), HttpStatus.OK);
    }

    @DeleteMapping("/borrarUsuario/{id}")
    public ResponseEntity<RespuestaDTO> borrarUsuario(@PathVariable Integer id){
        return new ResponseEntity<>(usuarioService.borrarUsuario(id), HttpStatus.OK);
    }

}
