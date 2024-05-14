package org.example;

interface Prestable {
    void prestar();
    void devolver();
}

interface NoPrestable {
    void utilizarEnBiblioteca();
    void devolverEnBiblioteca();
}

abstract class ArticuloBiblioteca {
    protected String codigo;
    protected String nombre;
    protected int añoPublicacion;

    public ArticuloBiblioteca(String codigo, String nombre, int añoPublicacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.añoPublicacion = añoPublicacion;
    }

    public abstract void mostrarAtributos();
}
