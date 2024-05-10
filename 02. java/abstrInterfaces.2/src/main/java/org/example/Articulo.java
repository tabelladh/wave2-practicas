package org.example;

public abstract class Articulo {
    protected String codigo;
    protected String nombre;
    protected Integer anioPublicacion;

    public Articulo(String codigo, String nombre, Integer anioPublicacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.anioPublicacion = anioPublicacion;
    }

    public Integer getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(Integer anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public abstract String mostrarAtributos();
}
