package com.example.Ejercicio3_Promedio.Service;

import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Service
public class AlumnoDTO{

    private String nombre;
    private String apellido;
    private ArrayList<Double> calificaciones;

    public AlumnoDTO() {}

    public AlumnoDTO(String nombre, String apellido, Array[] calificaciones) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.calificaciones = new ArrayList<Double>();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Double> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(ArrayList<Double> calificaciones) {
        this.calificaciones = calificaciones;
    }

    @Override
    public String toString() {
        return "AlumnoDTO{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", calificaciones=" + calificaciones +
                '}';
    }

    public double getPromedio(ArrayList<Double> calificaciones) {
        double promedio = 0;
        for (int i = 0; i < calificaciones.size(); i++) {
            promedio += calificaciones.get(i);
        }
        return promedio / calificaciones.size();
    }
}
