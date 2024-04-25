package org.example;

public class Informe extends Documento {
    private String contenido;
    private int cantidadDePaginas;
    private String autor;
    private String revisor;

    public Informe(String id_documento, String contenido, int cantidadDePaginas, String autor, String revisor) {
        super(id_documento);
        this.contenido = contenido;
        this.cantidadDePaginas = cantidadDePaginas;
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public void imprimir() {
        System.out.println("Contenido: " + contenido + ",  Cant. paginas: " + cantidadDePaginas + ", Autor: " + autor + ", Revisor: " + revisor);
    }
}

