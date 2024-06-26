package com.example.joyeria.service;

import com.example.joyeria.dto.ResDto;
import com.example.joyeria.dto.RespuestaDto;
import com.example.joyeria.model.Joya;

import java.util.List;

public interface IjoyaService {

    List<Joya> listar();
    RespuestaDto crear (Joya joya);
    ResDto actualizar(Long id, Joya joya);
    RespuestaDto borrar(Long id);

}
