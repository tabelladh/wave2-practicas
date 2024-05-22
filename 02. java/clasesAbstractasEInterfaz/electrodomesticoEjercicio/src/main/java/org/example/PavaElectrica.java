package org.example;

public class PavaElectrica extends Electrodomestico {
    private int temperaturaMaxima;
    private boolean poseeRegulador;

    public PavaElectrica() {
    }

    public PavaElectrica(int codigo, String nombre, String marca, String modelo, String descripcion, int cantidad, Double precioCosto, Double precioVenta, int temperaturaMaxima, boolean poseeRegulador) {
        super(codigo, nombre, marca, modelo, descripcion, cantidad, precioCosto, precioVenta);
        this.temperaturaMaxima = temperaturaMaxima;
        this.poseeRegulador = poseeRegulador;
    }

    public int getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(int temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public boolean isPoseeRegulador() {
        return poseeRegulador;
    }

    public void setPoseeRegulador(boolean poseeRegulador) {
        this.poseeRegulador = poseeRegulador;
    }
    @Override
    public String toString() {
        return "PavaElectrica{" +
                "temperaturaMaxima=" + temperaturaMaxima +
                ", poseeRegulador=" + poseeRegulador +
                "} " + super.toString();
    }

    @Override
    public String aumentarStock() {
        return "aumenta stock de 1 pava electrica";
    }

    @Override
    public String descontarStock() {
        return "disminuye stock de 1 pava electrica";
    }

    @Override
    public String vender() {
        return "Se vendió de 1 pava electrica";
    }
}
