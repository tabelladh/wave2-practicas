package org.example;

public class Microonda extends Electrodomestico {
    private int tamanio;
    private boolean poseeBandeja;


    public Microonda(int codigo, String nombre, String marca, String modelo, String descripcion, int cantidad, int precioCosto, int precioVenta, int tamanio, boolean poseeBandeja) {
        super(nombre, codigo, marca, modelo, cantidad, descripcion, precioCosto, precioVenta);
        this.tamanio = tamanio;
        this.poseeBandeja = poseeBandeja;
    }


    @Override
    public void aumentarStock() {
        System.out.println("Aumentar stock");
    }
    @Override
    public void descontarStock() {
        System.out.println("No escontar del stock");
    }
    @Override
    public void vender() {
        System.out.println("No hay Microondas vendidos");
    }
}
