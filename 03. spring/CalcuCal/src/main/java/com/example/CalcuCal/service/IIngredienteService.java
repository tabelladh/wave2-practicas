package com.example.CalcuCal.service;

import com.example.CalcuCal.dto.request.PlatoDTO;
import com.example.CalcuCal.dto.response.RespuestaDTO;
import com.example.CalcuCal.model.Ingrediente;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface IIngredienteService {

    List<Ingrediente> obtenerIngredientes();

    RespuestaDTO retornarCaloriasTotales(PlatoDTO plato);


}
