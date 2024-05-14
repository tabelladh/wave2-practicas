package org.example;

class Informe extends Documento {
    private String contenido;
    private String autor;
    private String revisor;
    private int cantidadPaginas;

    public Informe(int id_documento, String contenido, String autor, String revisor, int cantidadPaginas) {
        super(id_documento);
        this.contenido = contenido;
        this.autor = autor;
        this.revisor = revisor;
        this.cantidadPaginas = cantidadPaginas;
    }

    @Override
    public void imprimir() {
        System.out.println("Informe - ID: " + id_documento);
        System.out.println("Contenido: " + contenido);
    }
}
