package com.example.demoMetrosCuadrados.dto;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PropiedadDTO {

    private String nombrePropiedad;
    private String direccionPropiedad;
    private List<Habitacion> habitaciones;

}