package org.example;

public class Microondas extends Electrodomestico{

    private int tamanio;
    private Boolean poseeBandeja;

    public Microondas() {
    }

    public Microondas(int codigo, String nombre, String marca, String modelo, String descripcion, int cantidad, int precioCosto, int precioVenta, int tamanio, Boolean poseeBandeja) {
        super(codigo, nombre, marca, modelo, descripcion, cantidad, precioCosto, precioVenta);
        this.tamanio = tamanio;
        this.poseeBandeja = poseeBandeja;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public Boolean getPoseeBandeja() {
        return poseeBandeja;
    }

    public void setPoseeBandeja(Boolean poseeBandeja) {
        this.poseeBandeja = poseeBandeja;
    }

    @Override
    public String aumentarStock() {
        return "Aumento el stock de Microondas";
    }

    @Override
    public String descontarStock() {
        return "Disminuyo el stock de Microondas";
    }

    @Override
    public String vender() {
        return "Vendiendo Microondas";
    }

    @Override
    public String toString() {
        return "Microondas{" +
                "tamanio=" + tamanio +
                ", poseeBandeja=" + poseeBandeja +
                ", codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cantidad=" + cantidad +
                ", precioCosto=" + precioCosto +
                ", precioVenta=" + precioVenta +
                '}';
    }
}
