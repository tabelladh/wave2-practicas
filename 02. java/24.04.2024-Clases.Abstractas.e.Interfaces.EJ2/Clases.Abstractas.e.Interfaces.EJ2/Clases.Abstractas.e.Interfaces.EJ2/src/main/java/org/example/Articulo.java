package org.example;

public abstract class Articulo {

    protected String codigo;
    protected String nombre;
    protected int anoPublicacion;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }
    public Articulo(){}

    public Articulo(String codigo, String nombre, int anoPublicacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.anoPublicacion = anoPublicacion;
    }

}
