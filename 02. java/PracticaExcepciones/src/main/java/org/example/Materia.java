package org.example;

public class Materia {


    private String nombre;

    private int aula;

    public Materia() {
    }

    public Materia(String nombre, int aula) {
        this.nombre = nombre;
        this.aula = aula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getaula() {
        return aula;
    }

    public void setaula(int aula) {
        this.aula = aula;
    }

    @Override
    public String toString() {
        return "[Materia: " +
                "Nombre='" + nombre + '\'' +
                ", Aula=" + aula +
                ']';
    }
}
