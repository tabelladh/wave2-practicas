package org.example;

public class Libro extends Articulo implements IPrestable{
  private String autor;
  private boolean prestado;


    public Libro() {
    }

    public Libro(int codigo, String nombre, int anioPublicacion, String autor, boolean prestado) {
        super(codigo, nombre, anioPublicacion);
        this.autor = autor;
        this.prestado = prestado;
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
        return "comprado";
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
        return "se puede prestar libro";
    }

    @Override
    public String devolver() {
        return "se devuelve el libro";
    }
}
