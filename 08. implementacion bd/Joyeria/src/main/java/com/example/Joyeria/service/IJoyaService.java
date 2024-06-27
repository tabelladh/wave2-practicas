package com.example.Joyeria.service;

import com.example.Joyeria.DTO.RespuestaDTO;
import com.example.Joyeria.model.Joya;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IJoyaService {

    List<Joya> listarJoyas();
    RespuestaDTO crearJoya(Joya joya);
    RespuestaDTO save(Integer id, Joya joya);
    RespuestaDTO eliminarJoyas(Integer id);
    Joya traerJoyaPorid(Integer id);



}
