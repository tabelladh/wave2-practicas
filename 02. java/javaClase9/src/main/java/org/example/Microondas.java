package org.example;

class Microondas extends Electrodomestico {
    private String tamanio;
    private boolean poseeBandeja;

    public Microondas(int codigo, String nombre, String marca,String modelo,
                      String descripcion, int cantidad, double precioCosto, double precioVenta,
                      String tamanio, boolean poseeBandeja) {
        super(codigo, nombre, marca, modelo, descripcion, cantidad, precioCosto, precioVenta);
        this.tamanio = tamanio;
        this.poseeBandeja = poseeBandeja;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Tamaño: " + tamanio + "\n" +
                "Posee Bandeja: " + poseeBandeja + "\n";
    }

    @Override
    void aumentarStock(int cantidad) {

    }

    @Override
    void descontarStock(int cantidad) {

    }

    @Override
    public void vender() {
        System.out.println("Vendiendo microondas.");
    }
}
