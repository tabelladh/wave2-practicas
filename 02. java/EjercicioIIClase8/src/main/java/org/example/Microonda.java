package org.example;

public class Microonda extends Electrodomestico{
    protected String tamanio;
    protected boolean poseeBandeja;

    public Microonda(int codigo, String nombre, String marca, String modelo, String descripcion,
                     int cantidad, double precioCosto, double precioVenta, String tamanio, boolean poseeBandeja) {
        super(codigo, nombre, marca, modelo, descripcion, cantidad, precioCosto, precioVenta);
        this.tamanio = tamanio;
        this.poseeBandeja = poseeBandeja;
    }

    @Override
    public void aumentarStock() {
        System.out.println("Aumentando stock de microondas");
    }

    @Override
    public void descontarStock() {
        System.out.println("Descontando del stock microondas");
    }

    @Override
    public void vender() {
        System.out.println("Vendiendo microondas");
    }

    @Override
    public String toString() {
        return "Microonda{" +
                "tamanio=" + tamanio +
                ", poseeBandeja=" + poseeBandeja +
                '}';
    }
}
