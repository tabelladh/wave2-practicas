package com.example.AlumnoDTORP.service;

import com.example.AlumnoDTORP.dto.CursoDTO;
import com.example.AlumnoDTORP.dto.response.CursoDuracionDTO;

import java.util.List;

public interface ICursoService {

    List<CursoDTO> traerTodos();

    CursoDTO traerPorId(Integer codigo);
    CursoDuracionDTO traerMasHoras();

    CursoDTO agregarCurso(CursoDTO cursoDTO);
}

