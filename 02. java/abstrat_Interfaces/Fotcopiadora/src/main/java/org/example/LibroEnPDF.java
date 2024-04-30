package org.example;

public class LibroEnPDF extends Fotocopiadora{
    int canPaginas;
    String titulo;
    String Autor;
    String genero;

    public LibroEnPDF(int idDocumento, int canPaginas, String titulo, String autor, String genero) {
        super(idDocumento);
        this.canPaginas = canPaginas;
        this.titulo = titulo;
        Autor = autor;
        this.genero = genero;
    }
    public LibroEnPDF() {

    }

    public int getCanPaginas() {
        return canPaginas;
    }

    public void setCanPaginas(int canPaginas) {
        this.canPaginas = canPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void imprimir() {
        return ("LIBRO:" + "\nTitulo: " + titulo + "\nAutor: " + Autor);
    }
}
