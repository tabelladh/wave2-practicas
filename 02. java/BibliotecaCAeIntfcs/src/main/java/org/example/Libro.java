package org.example;

public class Libro extends Articulo implements IPrestable  {

    private String autor;
    private boolean prestado;

    public Libro(String autor) {
        this.autor = autor;
    }

    public Libro(int codigo, String nombre, int anio, String autor, boolean prestado) {
        super(codigo, nombre, anio);
        this.autor = autor;
    }


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

    @Override
    public String procedencia() {
        return "Comprados";
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor + '\'' +
                ", prestado=" + prestado +
                '}';
    }

    @Override
    public String prestar() {
        return "Se presta el libro";
    }

    @Override
    public String devolver() {
        return "Se devuelve el libro";
    }
}
