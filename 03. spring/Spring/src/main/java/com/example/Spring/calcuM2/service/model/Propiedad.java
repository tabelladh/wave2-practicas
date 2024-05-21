package com.example.Spring.calcuM2.service.model;

import java.util.List;

public class Propiedad {
    private String nombre;
    private String direccion;
    private List<Habitacion> habitaciones;

    public Propiedad() {
    }

    public Propiedad(String nombre, String direccion, List<Habitacion> habitaciones) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.habitaciones = habitaciones;
    }

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

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }
}