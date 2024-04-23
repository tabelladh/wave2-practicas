package org.example;

import java.util.List;

public class Estudiante {


    private String nombre;
    private String apellidos;
    private int dni;
    private List<Materia> materias;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellidos, int dni, List<Materia> materias) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.materias = materias;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return ( nombre +  " " + apellidos +  ", DNI= " + dni );
    }
}
