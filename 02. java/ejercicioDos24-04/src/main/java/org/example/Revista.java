package org.example;

public class Revista extends Articulo implements INoPrestable{

    private int numEdicion;
    private String mes;

    public Revista() {
    }

    public Revista(int codigo, int anio, String nombre, int numEdicion, String mes) {
        super(codigo, anio, nombre);
        this.numEdicion = numEdicion;
        this.mes = mes;
    }

    public int getNumEdicion() {
        return numEdicion;
    }

    public void setNumEdicion(int numEdicion) {
        this.numEdicion = numEdicion;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    @Override
    public String procedencia() {
        return "";
    }

    @Override
    public String utilizarEnBiblioteca() {
        return "revista utilizada en biblioteca";
    }

    @Override
    public String devolverEnBiblioteca() {
        return "revista devuelta en biblioteca";
    }

    @Override
    public String toString() {
        return "Revista:" +
                "\ncodigo: " + getCodigo()+
                "\nanio: " + getAnio()+
                "\nnombre: " + getNombre()+
                "\nnumEdicion: " + numEdicion +
                "\nmes: " + mes;
    }
}
