package org.example;

public class Informe extends Documento{
    String contenido;
    int cantidadPaginas;
    String autor;
    String revisor;

    public Informe() {}

    public Informe(int idDocumento, String contenido, int cantidadPaginas, String autor, String revisor) {
        super(idDocumento);
        this.contenido = contenido;
        this.cantidadPaginas = cantidadPaginas;
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String toString() {
        return "Informe{" +
                "contenido='" + contenido + '\'' +
                '}';
    }

    @Override
    public void imprimir() {
        System.out.println(this.toString());

    }
}
