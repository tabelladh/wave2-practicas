package org.example;

public class PavaElectrica extends Electrodomestico{
    private int temperaturaMaxima;
    private boolean poseeRegulador;

    // Constructor
    public PavaElectrica(String codigo, String nombre, String marca, String modelo, String descripcion,
                         int cantidad, double precioCosto, double precioVenta, int temperaturaMaxima,
                         boolean poseeRegulador) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
        this.temperaturaMaxima = temperaturaMaxima;
        this.poseeRegulador = poseeRegulador;
    }

    // Métodos
    @Override
    public String aumentarStock() {
        return "Aumentando stock de Pava Eléctrica";
    }

    @Override
    public String descontarStock() {
        return "Descontando stock de Pava Eléctrica";
    }

    @Override
    public String vender() {
        return "Vendiendo Pava Eléctrica";
    }
}
