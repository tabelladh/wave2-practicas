package org.example.clasesEInterfaces.electrodomestico;

class Microondas extends Electrodomestico {
    private String tamanio;
    private boolean poseeBandeja;

    public Microondas() {
    }

    public Microondas(String codigo, String nombre, String marca, String modelo, String descripcion, int cantidad, double precioCosto, double precioVenta, String tamanio, boolean poseeBandeja) {
        super(codigo, nombre, marca, modelo, descripcion, cantidad, precioCosto, precioVenta);
        this.tamanio = tamanio;
        this.poseeBandeja = poseeBandeja;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public boolean isPoseeBandeja() {
        return poseeBandeja;
    }

    public void setPoseeBandeja(boolean poseeBandeja) {
        this.poseeBandeja = poseeBandeja;
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
        System.out.println("Tamaño: " + tamanio);
        System.out.println("Posee Bandeja: " + poseeBandeja);
    }

    // Métodos abstractos sobrescritos
    @Override
    public void aumentarStock() {
        System.out.println("Incorporando nuevo microondas al stock: " + nombre);}

    @Override
    public void descontarStock() {
        System.out.println("Descontando microondas del stock: " + nombre);
    }

    @Override
    public void vender() {
        System.out.println("Vendiendo microondas: " + nombre);
    }
}