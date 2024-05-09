package com.example.CalcuCalorias.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IngredienteConPesoDTO {

    private String name;
    private Integer weight;
}
