package com.example.CalcuCalorias.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IngredientesPorCaloriasYPesoDTO {

    private String name;
    private Integer weight;
    private Integer calories;
}
