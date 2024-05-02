package org.example.lambdaGenericWrapperStreams.jugadores;

class Jugador {
    private int id;
    private String nombre;
    private int posicion;

    public Jugador() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Jugador(int id, String nombre, int posicion) {
        this.id = id;
        this.nombre = nombre;
        this.posicion = posicion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPosicion() {
        return posicion;
    }
}