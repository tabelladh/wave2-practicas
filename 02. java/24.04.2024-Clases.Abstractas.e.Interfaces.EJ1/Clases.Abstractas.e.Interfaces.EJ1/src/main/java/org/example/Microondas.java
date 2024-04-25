package org.example;

public class Microondas extends Electrodomestico {

    private String tamanio;
    private boolean poseeBandeja;

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
        System.out.println("Aumentando stock de Microondas");
    }

    @Override
    public void descontarStock() {
        System.out.println("Descontando stock de Microondas");
    }

    @Override
    public void vender() {
        System.out.println("Vendiendo Microondas");
    }

}
