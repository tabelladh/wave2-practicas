package org.example;

public class Mapa extends Articulo implements INoPrestable{

    private String tipo;
    private int tamanio;

    public Mapa() {
    }

    public Mapa(int codigo, int anio, String nombre, String tipo, int tamanio) {
        super(codigo, anio, nombre);
        this.tipo = tipo;
        this.tamanio = tamanio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String procedencia() {
        return "";
    }

    @Override
    public String utilizarEnBiblioteca() {
        return "mapa utilizado en biblioteca";
    }

    @Override
    public String devolverEnBiblioteca() {
        return "mapa devuelto en biblioteca";
    }

    @Override
    public String toString() {
        return "Mapa{" +
                "\ncodigo: " + getCodigo()+
                "\nanio: " + getAnio()+
                "\nnombre: " + getNombre()+
                "\ntipo: " + tipo +
                "\ntamanio: " + tamanio;
    }
}
