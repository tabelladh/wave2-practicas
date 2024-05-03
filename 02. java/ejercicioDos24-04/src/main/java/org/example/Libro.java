package org.example;

public class Libro extends Articulo implements IPresable {

    private String autor;
    private boolean prestado;

    public Libro() {
    }

    public Libro(int codigo, int anio, String nombre, String autor, boolean prestado) {
        super(codigo, anio, nombre);
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
        return "";
    }

    @Override
    public String prestar() {
        return "libro prestado";
    }

    @Override
    public String devolver() {
        return "libro devuelto";
    }

    @Override
    public String toString() {
        return "Libro:" +
                "\ncodigo: " + getCodigo()+
                "\nanio: " + getAnio()+
                "\nnombre: " + getNombre()+
                "\nautor: " + autor +
                "\nprestado: " + prestado;
    }
}
