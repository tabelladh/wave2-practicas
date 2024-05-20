package com.example.calorias.dto.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor @NoArgsConstructor
public class PlatoDto {

    private String name;
    private List<IngredientePesoDto> ingredients;

}
