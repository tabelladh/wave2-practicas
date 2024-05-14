package com.example.Inmobiliaria.DTO;

import java.util.List;

public class PropiedadDTO{
    private String nombre;
    private String direccion;
    private List<HabitacionesDTO> habitaciones;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<HabitacionesDTO> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<HabitacionesDTO> habitaciones) {
        this.habitaciones = habitaciones;
    }
}
