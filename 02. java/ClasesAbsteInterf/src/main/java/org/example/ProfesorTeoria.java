package org.example;

public class ProfesorTeoria extends Profesor  {

    private String asignatura;
    private String linkMeet;

    public ProfesorTeoria() {
    }

    public ProfesorTeoria(Integer dni, String nombre, String apellido, int edad, String asignatura, String linkMeet) {
        super(dni,nombre, apellido, edad);
        this.asignatura = asignatura;
        this.linkMeet = linkMeet;
    }

    @Override
    public String darClase() {
        return "El profesor de Teoría da clases virtuales";
    }
}
