package org.example;

public class Libro extends Articulo implements Prestable {
    private String autor;
    private boolean prestado;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public Libro(String codigo, String nombre, int anoPublicacion, String autor) {
        super(codigo, nombre, anoPublicacion);
        this.autor = autor;
        this.prestado = false;
    }

    @Override
    public void prestar() {
        this.prestado = true;
        System.out.println("Libro " + nombre + " correctamente prestado");
    }

    @Override
    public void devolver() {
        this.prestado = false;
        System.out.println("Libro " + nombre + " devuelto correctamente");
    }


}
