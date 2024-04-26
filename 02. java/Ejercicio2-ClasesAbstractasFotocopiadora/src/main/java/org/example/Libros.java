package org.example;

public class Libros extends Documento{

    int cantidadPag;
    String autor;
    String titulo;
    String genero;

    public Libros(int idDocumento, int cantidadPag, String autor, String titulo, String genero) {
        super(idDocumento);
        this.cantidadPag = cantidadPag;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
    }

    public int getCantidadPag() {
        return cantidadPag;
    }

    public void setCantidadPag(int cantidadPag) {
        this.cantidadPag = cantidadPag;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String imprimir() {
        return "Libros{ " +
                "cantidadPag=" + cantidadPag +
                ", autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", idDocumento=" + idDocumento +
                '}';
    }
}
