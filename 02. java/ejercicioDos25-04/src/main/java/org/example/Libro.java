package org.example;

public class Libro extends Articulo {

    private int cantidadDePaginas;
    private String titulo, autor , genero;

    public Libro() {
    }

    public Libro(int idProducto, int cantidadDePaginas, String titulo, String autor, String genero) {
        super(idProducto);
        this.cantidadDePaginas = cantidadDePaginas;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }

    public int getCantidadDePaginas() {
        return cantidadDePaginas;
    }

    public void setCantidadDePaginas(int cantidadDePaginas) {
        this.cantidadDePaginas = cantidadDePaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void imprimir() {
        System.out.println("libro: " +
                            "\nidProducto: " + getIdProducto()+
                            "paginas: " + cantidadDePaginas+
                            "titulo: " + titulo+
                            "autor: " + autor+
                            "genero: " + genero);
    }
}
