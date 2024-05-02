package org.example.clasesEInterfaces.electrodomestico;

class PavaElectrica extends Electrodomestico {
    private int temperaturaMaxima;
    private boolean poseeRegulador;

    public PavaElectrica() {
    }

    public PavaElectrica(String codigo, String nombre, String marca, String modelo, String descripcion, int cantidad, double precioCosto, double precioVenta, int temperaturaMaxima, boolean poseeRegulador) {
        super(codigo, nombre, marca, modelo, descripcion, cantidad, precioCosto, precioVenta);
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

    public void mostrarDetalles() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio de Costo: " + precioCosto);
        System.out.println("Precio de Venta: " + precioVenta);
        System.out.println("Temperatura Máxima: " + temperaturaMaxima);
        System.out.println("Posee Regulador: " + poseeRegulador);
    }

    // Métodos abstractos sobrescritos
    @Override
    public void aumentarStock() {
        System.out.println("Incorporando nueva pava eléctrica al stock: " + nombre);
    }

    @Override
    public void descontarStock() {
        System.out.println("Descontando pava eléctrica del stock: " + nombre);
    }

    @Override
    public void vender() {
        System.out.println("Vendiendo pava eléctrica: " + nombre);
    }
}