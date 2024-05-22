package org.example;

public class Microondas extends Electrodomestico{
    private String tamanio;
    private boolean poseeBandeja;

    public Microondas(int codigo, String nombre, String marca, String modelo, String descripcion, int cantidad, Double precioCosto, Double precioVenta, String tamanio, boolean poseeBandeja) {
        super(codigo, nombre, marca, modelo, descripcion, cantidad, precioCosto, precioVenta);
        this.tamanio = tamanio;
        this.poseeBandeja = poseeBandeja;
    }

    public Microondas() {
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
    public String toString() {
        return "Microondas{" +
                "tamanio='" + tamanio + '\'' +
                ", poseeBandeja=" + poseeBandeja +
                "} " + super.toString();
    }
    @Override
    public String aumentarStock() {
        return "aumenta stock de 1 microondas";
    }

    @Override
    public String descontarStock() {
        return "disminuye stock de 1 microondas";
    }

    @Override
    public String vender() {
        return "Se vendió de 1 microondas";
    }

}
