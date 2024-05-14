package org.example;

public class Alumno {

    int dni;
    String nombre;
    String apellido;
    double promedio;


    public Alumno(int dni, String nombre, String apellido, double promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.promedio = promedio;
        this.dni = dni;
    }
    public Alumno() {}

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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}
