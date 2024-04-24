package org.example;

public class ProfesorPractica implements IProfesor{

    private String nombre;

    public ProfesorPractica(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String tomarAsistencia() {
        return "Tomando asistencia desde la clase practica";
    }

    @Override
    public String darClase() {
        return "Dando clase desde la clase practica";
    }

    @Override
    public String toString() {
        return "ProfesorPractica{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
