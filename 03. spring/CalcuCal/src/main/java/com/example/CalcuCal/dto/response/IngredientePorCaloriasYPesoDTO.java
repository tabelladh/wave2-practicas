package com.example.CalcuCal.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IngredientePorCaloriasYPesoDTO {

    private String name;
    private Integer calories;
    private Integer weight;
}
