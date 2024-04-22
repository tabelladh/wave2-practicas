package org.example;

public class Alumno {

    private String nombre;
    private String apellido;
    private Integer dni;
    private float promedio;

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public Alumno(String nombre, String apellido, Integer dni, float promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.promedio = promedio;
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

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
}
