package com.example.CalcuCalorias.dto.request;


import lombok.*;

import java.util.List;
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@ToString
public class PlatoDTO {

    private String nombre;
    private List<IngredienteConPesoDTO> ingredientes; //name y weight


}
