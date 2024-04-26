package org.example;

public class Libro extends Documento{
    private int cantPaginas;
    private String titulo;
    private String autor;
    private String genero;

    public Libro() {

    }

    public Libro(int cantPaginas, String titulo, String autor, String genero) {
        this.cantPaginas = cantPaginas;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
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
        System.out.println("Id: " + id_documento);
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Genero: " + genero);
    }
}
