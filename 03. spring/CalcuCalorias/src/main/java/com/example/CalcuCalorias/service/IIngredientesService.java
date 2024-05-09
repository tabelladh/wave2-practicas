package com.example.CalcuCalorias.service;

import com.example.CalcuCalorias.dto.request.PlatoDTO;
import com.example.CalcuCalorias.dto.response.IngredientesPorCaloriasYPesoDTO;
import com.example.CalcuCalorias.dto.response.RespuestaDTO;
import com.example.CalcuCalorias.model.Ingrediente;

import java.util.List;

public interface IIngredientesService {

    List<Ingrediente> obtenerIngredientes();

    RespuestaDTO retornarCaloriasTotales(PlatoDTO platoDTO);

    List<IngredientesPorCaloriasYPesoDTO> retornarCaloriasTotalesPorIngrediente(PlatoDTO platoDTO);

    RespuestaDTO retornarIngredienteConMasCalorias(PlatoDTO platoDTO);

}
