package org.example;

class Microondas extends Electrodomestico {
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
    public void aumentarStock() {
        System.out.println("Aumentando stock de Microondas");
    }

    @Override
    public void descontarStock() {
        System.out.println("Descontando stock de Microondas");
    }

    @Override
    public void vender() {
        System.out.println("Vendiendo Microondas");
    }

    @Override
    public String toString() {
        return "Microondas{" +
                "tamanio='" + tamanio + '\'' +
                ", poseeBandeja=" + poseeBandeja +
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
