package com.example.Spring.calorias.service;

import com.example.Spring.calorias.dto.request.PlatoDTO;
import com.example.Spring.calorias.dto.response.IngredientePorCaloriasYPesoDTO;
import com.example.Spring.calorias.dto.response.RespuestaDTO;
import com.example.Spring.calorias.model.Ingrediente;
import java.util.List;

public interface IngredienteService {
   List<Ingrediente> obtenerIngredientes();
   RespuestaDTO retornarCaloriasTotales(PlatoDTO plato);
   List<IngredientePorCaloriasYPesoDTO> retornarCaloriasPorIngrediente(PlatoDTO platoDTO);
   RespuestaDTO encontrarIngredienteConMasCalorias(PlatoDTO platoDTO);
}
