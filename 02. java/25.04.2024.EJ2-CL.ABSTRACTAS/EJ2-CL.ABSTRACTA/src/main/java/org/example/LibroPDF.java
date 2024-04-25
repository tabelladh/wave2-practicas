package org.example;

public class LibroPDF extends Documento {
    private int cantidadDePaginas;
    private String titulo;
    private String autor;
    private String genero;

    public LibroPDF(String id_documento, int cantidadDePaginas, String titulo, String autor, String genero) {
        super(id_documento);
        this.cantidadDePaginas = cantidadDePaginas;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }

    @Override
    public void imprimir() {
        System.out.println("Titulo: " + titulo + ", Autor: " + autor + ", Genero: " + genero );
    }
}

