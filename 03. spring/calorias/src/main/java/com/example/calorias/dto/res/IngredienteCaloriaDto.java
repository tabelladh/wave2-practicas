package com.example.calorias.dto.res;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IngredienteCaloriaDto {

    private String name;
    private Integer weight;
    private Integer calories;

}
