package org.example.clasesEInterfaces.biblioteca;

public abstract class ArticuloBiblioteca {
    private String codigo;
    private String nombre;
    private int anioPublicacion;

    public ArticuloBiblioteca() {
    }

    public ArticuloBiblioteca(String codigo, String nombre, int anioPublicacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.anioPublicacion = anioPublicacion;
    }

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

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    // Método abstracto
    public abstract String procedencia();
}
