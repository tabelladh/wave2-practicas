package org.example;

public class HornoElectrico extends Electrodomestico {
    protected int temperaturaMaxima;
    protected boolean poseeGrill;
    protected boolean poseeAutolimpieza;

    public HornoElectrico(int codigo, String nombre, String marca, String modelo, String descripcion,
                          int cantidad, double precioCosto, double precioVenta, int temperaturaMaxima, boolean poseeGrill, boolean poseeAutolimpieza) {
        super(codigo, nombre, marca, modelo, descripcion, cantidad, precioCosto, precioVenta);
        this.temperaturaMaxima = temperaturaMaxima;
        this.poseeGrill = poseeGrill;
        this.poseeAutolimpieza = poseeAutolimpieza;
    }

    @Override
    public void aumentarStock() {
        System.out.println("Aumentando stock de horno eléctrico");
    }

    @Override
    public void descontarStock() {
        System.out.println("Descontando del stock horno eléctrico");
    }

    @Override
    public void vender() {
        System.out.println("Vendiendo horno eléctrico");
    }

    @Override
    public String toString() {
        return "HornoElectrico{" +
                "temperaturaMaxima=" + temperaturaMaxima +
                ", poseeGrill=" + poseeGrill +
                ", poseeAutolimpieza=" + poseeAutolimpieza +
                '}';
    }
}
