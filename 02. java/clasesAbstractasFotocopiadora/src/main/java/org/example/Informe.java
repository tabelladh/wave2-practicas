package org.example;

public class Informe extends Documento{
    private String contenido;
    private String autor;
    private int cantPaginas;
    private String revisor;

    public Informe() {
    }

    public Informe(String contenido, String autor, int cantPaginas, String revisor) {
        this.contenido = contenido;
        this.autor = autor;
        this.cantPaginas = cantPaginas;
        this.revisor = revisor;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    public String getRevisor() {
        return revisor;
    }

    public void setRevisor(String revisor) {
        this.revisor = revisor;
    }
    @Override
    public void imprimir() {
        System.out.println("Id: " + id_documento);
        System.out.println("Contenido: " + contenido);
        System.out.println("Autor: " + autor);
        System.out.println("Cantidad de paginas: " + cantPaginas);
        System.out.println("Revisor: " + revisor);
    }
}
