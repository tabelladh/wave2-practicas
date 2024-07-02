package com.example.AlumnoDTORP.service;

import com.example.AlumnoDTORP.dto.CursoDTO;
import com.example.AlumnoDTORP.dto.RespuestaDTO;
import com.example.AlumnoDTORP.dto.response.CursoDuracionDTO;

import java.util.List;

public interface ICursoService {

    List<CursoDTO> traerTodos();

    CursoDTO traerPorId(Integer codigo);

    RespuestaDTO traerCertificado(String nombre);

    CursoDuracionDTO traerMasHoras();

    CursoDuracionDTO traerMaxDuracion();

}

