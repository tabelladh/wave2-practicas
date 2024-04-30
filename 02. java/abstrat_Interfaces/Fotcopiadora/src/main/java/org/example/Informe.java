package org.example;

public class Informe extends Fotocopiadora {
    String contenido;
    int cantPaginas;
    String autor;
    String revisor;

    public Informe(int idDocumento, String contenido, int cantPaginas, String autor, String revisor) {
        super(idDocumento);
        this.contenido = contenido;
        this.cantPaginas = cantPaginas;
        this.autor = autor;
        this.revisor = revisor;
    }

    public Informe(){
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getRevisor() {
        return revisor;
    }

    public void setRevisor(String revisor) {
        this.revisor = revisor;
    }
    @Override
    public void imprimir() {
        return ("INFORME:" + "\nContenido: " + contenido);
    }
}
