package org.example;

public class PavaElectrica extends Electrodomestico {
    private int tempMaxima;
    private boolean poseeRegulador;


    public PavaElectrica(int codigo, String nombre, String marca, String modelo, String descripcion, int cantidad, int precioCosto, int precioVenta, int tempMaxima, boolean poseeRegulador) {
        super(nombre, codigo, marca, modelo, cantidad, descripcion, precioCosto, precioVenta);
        this.tempMaxima = tempMaxima;
        this.poseeRegulador = poseeRegulador;
    }

    @Override
    public void aumentarStock() {
        System.out.println("Aumentar stock");
    }
    @Override
    public void descontarStock() {
        System.out.println("Descontar del stock");
    }
    @Override
    public void vender() {
        System.out.println("Pava electrica vendida");
    }
}
