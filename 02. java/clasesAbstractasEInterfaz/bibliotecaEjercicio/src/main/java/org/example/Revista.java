package org.example;

public class Revista extends Articulo implements INoPrestable{
   private int numeroEdicion;
   private String mes;

    public Revista() {
    }

    public Revista(int codigo, String nombre, int anioPublicacion, int numeroEdicion, String mes) {
        super(codigo, nombre, anioPublicacion);
        this.numeroEdicion = numeroEdicion;
        this.mes = mes;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "numeroEdicion=" + numeroEdicion +
                ", mes='" + mes + '\'' +
                '}';
    }

    @Override
    public String procedencia() {
        return "donada";
    }

    @Override
    public String utilizarEnBiblioteca() {
        return "la revista se utiliza en la biblioteca";
    }

    @Override
    public String devolverEnBiblioteca() {
        return "la revista se utiliza en la biblioteca";
    }
}
