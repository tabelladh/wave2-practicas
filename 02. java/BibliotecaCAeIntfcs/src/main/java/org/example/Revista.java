package org.example;

public class Revista extends Articulo implements INoPrestable {

    private int numEdicion;

    private String mes;

    public Revista() {
    }

    public Revista(int codigo, String nombre, int anio, int numEdicion, String mes) {
        super(codigo, nombre, anio);
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
        return "Donada";
    }

    @Override
    public String toString() {
        return "Revista{" +
                "numEdicion=" + numEdicion +
                ", mes='" + mes + '\'' +
                '}';
    }

    @Override
    public String utilizarEnBiblioteca() {
        return "Se utiliza en biblioteca la revista";
    }

    @Override
    public String devolverEnBiblioteca() {
        return "Se devuelve en biblioteca la revista";
    }
}
