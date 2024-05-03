package org.example;

public class ServiciosGenericos <E>{

    private E id;
    private String nombre;

    public ServiciosGenericos() {
    }

    public ServiciosGenericos(E id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public E getId() {
        return id;
    }

    public void setId(E id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
