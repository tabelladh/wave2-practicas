package org.example;

public class LibroPdf extends Documento{
    int cantidadPaginas;
    String titulo;
    String autor;
    String genero;

    public LibroPdf() {}

    public LibroPdf(int idDocumento, int cantidadPaginas, String titulo, String autor, String genero) {
        super(idDocumento);
        this.cantidadPaginas = cantidadPaginas;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
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
    public String toString() {
        return "LibroPdf{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }

    @Override
    public void imprimir() {
        System.out.println(this.toString());

    }
}
