package com.example.AlumnoDTORP.service;

import com.example.AlumnoDTORP.dto.RespuestaDTO;
import com.example.AlumnoDTORP.dto.response.UsuarioDTO;

import java.util.List;

public interface IUsuarioService {
    List<UsuarioDTO> listarUsuarios();

    RespuestaDTO borrarUsuario(Integer id);
}
