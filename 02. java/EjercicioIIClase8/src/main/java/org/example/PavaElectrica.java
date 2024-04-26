package org.example;

public class PavaElectrica extends Electrodomestico {
    protected int temperaturaMaxima;
    protected boolean poseeRegulador;

    public PavaElectrica(int codigo, String nombre, String marca, String modelo, String descripcion,
                         int cantidad, double precioCosto, double precioVenta, int temperaturaMaxima,
                         boolean poseeRegulador) {
        super(codigo, nombre, marca, modelo, descripcion, cantidad, precioCosto, precioVenta);
        this.temperaturaMaxima = temperaturaMaxima;
        this.poseeRegulador = poseeRegulador;
    }

    @Override
    public void aumentarStock() {
        System.out.println("Aumentando stock de pava eléctrica");
    }

    @Override
    public void descontarStock() {
        System.out.println("Descontando del stock pava eléctrica");
    }

    @Override
    public void vender() {
        System.out.println("Vendiendo pava eléctrica");
    }

    @Override
    public String toString() {
        return "PavaElectrica{" +
                "temperaturaMaxima=" + temperaturaMaxima +
                ", poseeRegulador=" + poseeRegulador +
                '}';
    }
}
