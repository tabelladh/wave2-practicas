package org.example;

 public class Microondas extends Electrodomestico{
    private String tamanio;
    private boolean poseeBandeja;


    public Microondas(String codigo, String nombre, String marca, String modelo, String descripcion,
                      int cantidad, double precioCosto, double precioVenta, String tamanio,
                      boolean poseeBandeja) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
        this.tamanio = tamanio;
        this.poseeBandeja = poseeBandeja;
    }


    @Override
    public String aumentarStock() {
        return "Aumentando stock de Microondas";
    }

    @Override
    public String descontarStock() {
        return "Descontando stock de Microondas";
    }

    @Override
    public String vender() {
        return "Vendiendo Microondas";
    }
}
