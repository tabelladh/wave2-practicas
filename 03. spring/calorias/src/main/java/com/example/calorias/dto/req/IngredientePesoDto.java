package com.example.calorias.dto.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
public class IngredientePesoDto {

    private String name;
    private Integer weight;

}
