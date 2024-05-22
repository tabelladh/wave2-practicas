package org.example;

public abstract class Articulo {
   private   int codigo;
   private String nombre;
   private int anioPublicacion;

    public Articulo() {
    }

    public Articulo(int codigo, String nombre, int anioPublicacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.anioPublicacion = anioPublicacion;
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

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public abstract String procedencia();
}
