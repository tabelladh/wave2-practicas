package org.example;

public class PavaElectrica  extends  Electrodomestico{
    int temperaturaMaxima;
    boolean poseeRegulador;

    public PavaElectrica(int codigo, String nombre, String marca, String modelo, String descripcion, int cantidad, double precioCosto, double precioVenta, int temperaturaMaxima, boolean poseeRegulador) {
        super(codigo, nombre, marca, modelo, descripcion, cantidad, precioCosto, precioVenta);
        this.temperaturaMaxima = temperaturaMaxima;
        this.poseeRegulador = poseeRegulador;
    }


    @Override
    void aumentarStock(int cantidad) {

    }

    @Override
    void descontarStock(int cantidad) {

    }

    @Override
    void vender() {
        System.out.println("Vendiendo Pava Eléctrica.");
    }

    // Método para mostrar información pavaElectrica
    @Override
    public String toString() {
        return super.toString() +
                "Temperatura Maxima: " + temperaturaMaxima + "\n" +
                "Posee regulador: " + poseeRegulador + "\n";

    }
}

