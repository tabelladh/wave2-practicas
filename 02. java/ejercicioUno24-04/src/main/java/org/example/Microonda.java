package org.example;

public class Microonda extends Electrodomestico{

    private String tamanio;
    private boolean poseeBandeja;

    public Microonda() {
    }

    public Microonda(int codigo, int cantidad, String nombre, String modelo, String descripcion, double precioCosto,
                     double precioVenta, String tamanio, boolean poseeBandeja) {
        super(codigo, cantidad, nombre, modelo, descripcion, precioCosto, precioVenta);
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

    @Override
    public void aumentarStock() {
        System.out.println("microondas agregado");
    }

    @Override
    public void descontarStock() {
        System.out.println("microondas descontado");
    }

    @Override
    public void vender() {
        System.out.println("microondas vendido");
    }

    @Override
    public String toString() {
        return "Microonda: " +
                "\ncodigo: "+getCodigo()+
                "\ncantidad: "+getCantidad()+
                "\nnombre: "+getNombre()+
                "\nmodelo: "+getModelo()+
                "\ndescripcion: "+getDescripcion()+
                "\nprecioCosto: "+getPrecioCosto()+
                "\nprecioVenta: "+getPrecioVenta()+
                "\ntamanio: " + tamanio +
                "\nposeeBandeja: " + poseeBandeja;
    }
}
