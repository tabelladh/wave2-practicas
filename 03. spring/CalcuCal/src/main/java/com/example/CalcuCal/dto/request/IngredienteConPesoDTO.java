package com.example.CalcuCal.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IngredienteConPesoDTO {

    private String name;
    private Integer weight;

}
