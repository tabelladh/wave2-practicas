package com.example.demo.DTO;

import com.example.demo.Model.Habitacion;
import com.example.demo.Model.Propiedad;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
public class PropiedadDTO {

    private String nombrePropiedad;
    private String direccionPropiedad;
    private List<Habitacion> habitaciones;

}
