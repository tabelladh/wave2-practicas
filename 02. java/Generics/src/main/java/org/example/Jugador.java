package org.example;

public class Jugador {
    int id;
    String nombre;
    int posicion;

    public Jugador(int id, String nombre, int posicion) {
        this.id = id;
        this.nombre = nombre;
        this.posicion = posicion;
    }
    public Jugador () {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }


}
