package org.example;

class LibroPDF extends Documento {
    private String titulo;
    private String autor;
    private int cantidadPaginas;
    private String genero;

    public LibroPDF(int id_documento, String titulo, String autor, int cantidadPaginas, String genero) {
        super(id_documento);
        this.titulo = titulo;
        this.autor = autor;
        this.cantidadPaginas = cantidadPaginas;
        this.genero = genero;
    }

    @Override
    public void imprimir() {
        System.out.println("Libro en PDF - ID: " + id_documento);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }
}
