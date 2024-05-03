package org.example;

public class Informe extends Articulo{

    private boolean incluyenContenido;
    private int cantidadDePaginas;
    private String autor,revisor;

    public Informe() {
    }

    public Informe(int idProducto, boolean incluyenContenido, int cantidadDePaginas, String autor, String revisor) {
        super(idProducto);
        this.incluyenContenido = incluyenContenido;
        this.cantidadDePaginas = cantidadDePaginas;
        this.autor = autor;
        this.revisor = revisor;
    }

    public boolean isIncluyenContenido() {
        return incluyenContenido;
    }

    public void setIncluyenContenido(boolean incluyenContenido) {
        this.incluyenContenido = incluyenContenido;
    }

    public int getCantidadDePaginas() {
        return cantidadDePaginas;
    }

    public void setCantidadDePaginas(int cantidadDePaginas) {
        this.cantidadDePaginas = cantidadDePaginas;
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
        System.out.println("informe: " +
                            "\nidProducto: " + getIdProducto()+
                            "\nincluye contenido: " + incluyenContenido+
                            "\ncantidad de paginas: " + cantidadDePaginas+
                            "\nautor: " + autor+
                            "\nrevisor: " + revisor);
    }
}
