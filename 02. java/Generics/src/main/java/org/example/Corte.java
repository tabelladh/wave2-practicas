package org.example;

public class Corte extends ServicioGenerico<String> {
    String tipo;

    public Corte(String id, String nombre, String tipo) {
        super(id, nombre);
        this.tipo = tipo;
    }
}
