package org.example;

public class PavaElectrica extends Electrodomestico{

    private int tempMaxima;
    private Boolean poseeRegulador;

    public PavaElectrica() {
    }

    public PavaElectrica(int codigo, String nombre, String marca, String modelo, String descripcion, int cantidad, int precioCosto, int precioVenta, int tempMaxima, Boolean poseeRegulador) {
        super(codigo, nombre, marca, modelo, descripcion, cantidad, precioCosto, precioVenta);
        this.tempMaxima = tempMaxima;
        this.poseeRegulador = poseeRegulador;
    }

    public int getTempMaxima() {
        return tempMaxima;
    }

    public void setTempMaxima(int tempMaxima) {
        this.tempMaxima = tempMaxima;
    }

    public Boolean getPoseeRegulador() {
        return poseeRegulador;
    }

    public void setPoseeRegulador(Boolean poseeRegulador) {
        this.poseeRegulador = poseeRegulador;
    }

    @Override
    public String aumentarStock() {
        return "Aumento el stock de Pavas Electricas";
    }

    @Override
    public String descontarStock() {
        return "Disminuyo el stock de Pavas Electricas";
    }

    @Override
    public String vender() {
        return "Vendiendo Pava Electrica";
    }

    @Override
    public String toString() {
        return "PavaElectrica{" +
                "tempMaxima=" + tempMaxima +
                ", poseeRegulador=" + poseeRegulador +
                ", codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", cantidad=" + cantidad +
                ", precioCosto=" + precioCosto +
                ", precioVenta=" + precioVenta +
                '}';
    }
}
