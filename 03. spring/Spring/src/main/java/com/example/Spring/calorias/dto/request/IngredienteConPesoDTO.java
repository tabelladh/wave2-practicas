package com.example.Spring.calorias.dto.request;

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