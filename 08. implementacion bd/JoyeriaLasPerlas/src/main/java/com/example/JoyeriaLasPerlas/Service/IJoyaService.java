package com.example.JoyeriaLasPerlas.Service;

import com.example.JoyeriaLasPerlas.DTO.RespuestaDTO;
import com.example.JoyeriaLasPerlas.Model.Joya;

import java.util.List;

public interface IJoyaService {

    public List<Joya> getJoyas();

    public Joya getJoya(Integer id);

    public RespuestaDTO saveJoya(Joya joya);

    public RespuestaDTO deleteJoya(Integer id);

    public RespuestaDTO updateJoya(Joya joya, Integer id);
}
