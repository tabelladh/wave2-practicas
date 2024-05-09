package com.example.CalcuCalorias.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Plato {

    private String nombre;
    private List<Ingrediente> ingredientes;

}
