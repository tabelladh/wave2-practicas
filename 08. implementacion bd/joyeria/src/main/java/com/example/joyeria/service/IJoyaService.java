package com.example.joyeria.service;

import com.example.joyeria.entity.Joya;
import com.example.joyeria.resquest.RespuestaDTO;
import com.example.joyeria.resquest.RespuestaJoyaDTO;

import java.util.List;

public interface IJoyaService {

    List<Joya> listarJoyas();

    RespuestaDTO crearJoya (Joya joya);

    RespuestaJoyaDTO actualizarJoya (Long id, Joya joya);

    RespuestaDTO borrarJoya (Long id);


}
