package com.example.CalcuCal.dto.request;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class PlatoDTO {

    private String nombre;
    private List<IngredienteConPesoDTO> ingredientes; // <Ingrediente>
}
