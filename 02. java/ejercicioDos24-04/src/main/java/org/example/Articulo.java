package org.example;

public abstract class Articulo {

    private int codigo,anio;
    private String nombre;

    public Articulo() {
    }

    public Articulo(int codigo, int anio, String nombre) {
        this.codigo = codigo;
        this.anio = anio;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract String procedencia();
}
