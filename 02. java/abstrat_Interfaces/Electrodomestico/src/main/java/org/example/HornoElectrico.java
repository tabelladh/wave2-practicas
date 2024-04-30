package org.example;

public class HornoElectrico extends Electrodomestico {
    private int tempMaxima;
    private boolean poseeGrill;
    private boolean poseeAutolimpieza;


    public HornoElectrico(int codigo, String nombre, String marca, String modelo, String descripcion, int cantidad, int precioCosto, int precioVenta, int tempMaxima, boolean poseeGrill, boolean poseeAutolimpieza) {
        super(nombre, codigo, marca, modelo, cantidad, descripcion, precioCosto, precioVenta);
        this.tempMaxima = tempMaxima;
        this.poseeGrill = poseeGrill;
        this.poseeAutolimpieza = poseeAutolimpieza;
    }

    @Override
    public void aumentarStock() {
        System.out.println("No aumentar stock");
    }
    @Override
    public void descontarStock() {
        System.out.println("Descontar uno del stock");
    }
    @Override
    public void vender() {
        System.out.println("Horno electrico vendido");
    }
}
