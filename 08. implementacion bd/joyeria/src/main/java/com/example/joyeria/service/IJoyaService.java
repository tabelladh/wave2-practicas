package com.example.joyeria.service;

import com.example.joyeria.model.Joya;

import java.util.List;

public interface IJoyaService{
   List<Joya> obtenerJoyas();
   Joya crearJoya(Joya joya);
   void eliminarJoya(Long id);
   Joya actualizarJoya(Long id, Joya joyaActualizada);
}