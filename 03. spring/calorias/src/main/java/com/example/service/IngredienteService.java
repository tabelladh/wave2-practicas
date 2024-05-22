package com.example.service;


import com.example.dto.request.PlatoDTO;
import com.example.dto.response.IngredientePorCaloriasYPesoDTO;
import com.example.dto.response.RespuestaDTO;
import com.example.model.Ingrediente;
import java.util.List;

public interface IngredienteService {
   List<Ingrediente> obtenerIngredientes();
   RespuestaDTO retornarCaloriasTotales(PlatoDTO plato);
   List<IngredientePorCaloriasYPesoDTO> retornarCaloriasPorIngrediente(PlatoDTO platoDTO);
   RespuestaDTO encontrarIngredienteConMasCalorias(PlatoDTO platoDTO);
}
