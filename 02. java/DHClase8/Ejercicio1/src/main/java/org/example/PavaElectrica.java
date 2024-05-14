package org.example;

class PavaElectrica extends Electrodomestico {
    private int temperaturaMaxima;
    private boolean poseeRegulador;

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

    @Override
    public void aumentarStock() {
        System.out.println("Aumentando stock de Pava Eléctrica");
    }

    @Override
    public void descontarStock() {
        System.out.println("Descontando stock de Pava Eléctrica");
    }

    @Override
    public void vender() {
        System.out.println("Vendiendo Pava Eléctrica");
    }

    @Override
    public String toString() {
        return "PavaElectrica{" +
                "temperaturaMaxima=" + temperaturaMaxima +
                ", poseeRegulador=" + poseeRegulador +
                ", codigo='" + codigo + '\'' +
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
