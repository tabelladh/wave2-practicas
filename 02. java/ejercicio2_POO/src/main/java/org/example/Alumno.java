package org.example;

public class Alumno {
    int dni;
    String nombre;
    String apellido;
    double promedio;

    public Alumno() {

    }

    public Alumno(int dni, String nombre, String apellido, double promedio) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.promedio = promedio;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }


}


