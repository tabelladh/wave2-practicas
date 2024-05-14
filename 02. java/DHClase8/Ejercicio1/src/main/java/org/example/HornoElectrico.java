package org.example;

class HornoElectrico extends Electrodomestico {
    private int temperaturaMaxima;
    private boolean poseeGrill;
    private boolean poseeAutolimpieza;

    public HornoElectrico(String codigo, String nombre, String marca, String modelo, String descripcion,
                          int cantidad, double precioCosto, double precioVenta, int temperaturaMaxima,
                          boolean poseeGrill, boolean poseeAutolimpieza) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
        this.temperaturaMaxima = temperaturaMaxima;
        this.poseeGrill = poseeGrill;
        this.poseeAutolimpieza = poseeAutolimpieza;
    }

    @Override
    public void aumentarStock() {
        System.out.println("Aumentando stock de Horno Eléctrico");
    }

    @Override
    public void descontarStock() {
        System.out.println("Descontando stock de Horno Eléctrico");
    }

    @Override
    public void vender() {
        System.out.println("Vendiendo Horno Eléctrico");
    }

    @Override
    public String toString() {
        return "HornoElectrico{" +
                "temperaturaMaxima=" + temperaturaMaxima +
                ", poseeGrill=" + poseeGrill +
                ", poseeAutolimpieza=" + poseeAutolimpieza +
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
