package org.example;

// necesita un sistema que le permita almacenar los datos y
// promedio de sus 10 alumnos de ésta asignatura.

public class Alumno {

    String dni;
    String nombre;
    String apellido;
    double promedio;

    public Alumno() {
    }

    public Alumno(String dni, String nombre, String apellido, double promedio) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.promedio = promedio;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
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
