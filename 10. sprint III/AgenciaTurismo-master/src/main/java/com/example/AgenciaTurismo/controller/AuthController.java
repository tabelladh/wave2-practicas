package com.example.AgenciaTurismo.controller;

import com.example.AgenciaTurismo.dto.request.LoginDTO;
import com.example.AgenciaTurismo.service.AuthServiceImpl;
import com.example.AgenciaTurismo.service.IAuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    IAuthService service;

    public AuthController(AuthServiceImpl service){
        this.service = service;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginDTO loginRequestDto){
        return ResponseEntity.ok(service.login(loginRequestDto));
    }



}
