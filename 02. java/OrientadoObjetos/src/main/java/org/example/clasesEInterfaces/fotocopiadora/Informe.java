package org.example.clasesEInterfaces.fotocopiadora;

class Informe extends Documento {
    private String contenido;
    private String autor;
    private String revisor;
    private int cantidadPaginas;

    public Informe() {
    }

    public Informe(String id_documento, String contenido, String autor, String revisor, int cantidadPaginas) {
        super(id_documento);
        this.contenido = contenido;
        this.autor = autor;
        this.revisor = revisor;
        this.cantidadPaginas = cantidadPaginas;
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

    public String getRevisor() {
        return revisor;
    }

    public void setRevisor(String revisor) {
        this.revisor = revisor;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    @Override
    public void imprimir() {
        System.out.print("Contenido del informe: ");
        System.out.print(contenido);
    }
}
