package org.example;

public class ProfesorTeoria implements IProfesor{

    private String nombre;

    public ProfesorTeoria(String nombre) {
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
        return "Tomando asistencia desde la clase teoria";
    }

    @Override
    public String darClase() {
        return "Dando clase desde la clase teoria";
    }

}
