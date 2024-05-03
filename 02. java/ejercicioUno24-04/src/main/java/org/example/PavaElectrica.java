package org.example;

public class PavaElectrica extends Electrodomestico{

    private int temperaturaMaxima;
    private boolean poseeRegulador;

    public PavaElectrica() {
    }

    public PavaElectrica(int codigo, int cantidad, String nombre, String modelo, String descripcion, double precioCosto,
                         double precioVenta, int temperaturaMaxima, boolean poseeRegulador) {
        super(codigo, cantidad, nombre, modelo, descripcion, precioCosto, precioVenta);
        this.temperaturaMaxima = temperaturaMaxima;
        this.poseeRegulador = poseeRegulador;
    }

    public int getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(int temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public boolean isPoseeRegulador() {
        return poseeRegulador;
    }

    public void setPoseeRegulador(boolean poseeRegulador) {
        this.poseeRegulador = poseeRegulador;
    }

    @Override
    public void aumentarStock() {
        System.out.println("pava electrica agregada");
    }

    @Override
    public void descontarStock() {
        System.out.println("pava electrica descontada");
    }

    @Override
    public void vender() {
        System.out.println("pava electrica vendida");
    }

    @Override
    public String toString() {
        return "PavaElectrica:" +
                "\ncodigo: "+getCodigo()+
                "\ncantidad: "+getCantidad()+
                "\nnombre: "+getNombre()+
                "\nmodelo: "+getModelo()+
                "\ndescripcion: "+getDescripcion()+
                "\nprecioCosto: "+getPrecioCosto()+
                "\nprecioVenta: "+getPrecioVenta()+
                "\ntemperaturaMaxima: " + temperaturaMaxima +
                "\nposeeRegulador: " + poseeRegulador;
    }
}
