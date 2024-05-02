package org.example;

public abstract class Articulo {

    private int codigo;
    private String nombre;
    private int anio;

    public Articulo() {
    }

    public Articulo(int codigo, String nombre, int anio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.anio = anio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public abstract String procedencia();

}
