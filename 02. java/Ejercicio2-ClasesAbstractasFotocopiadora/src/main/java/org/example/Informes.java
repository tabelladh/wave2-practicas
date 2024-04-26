package org.example;

public class Informes extends Documento{
    String contenido;
    int cantidadPag;
    String autor;
    String revisor;

    public Informes(int idDocumento, String contenido, int cantidadPag, String autor, String revisor) {
        super(idDocumento);
        this.contenido = contenido;
        this.cantidadPag = cantidadPag;
        this.autor = autor;
        this.revisor = revisor;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
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

    public String getRevisor() {
        return revisor;
    }

    public void setRevisor(String revisor) {
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "Informes{ " +
                "contenido='" + contenido + '\'' +
                ", cantidadPag=" + cantidadPag +
                ", autor='" + autor + '\'' +
                ", revisor='" + revisor + '\'' +
                ", idDocumento=" + idDocumento +
                '}';
    }
}
