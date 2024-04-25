package org.example;

public class PavaElectrica extends Electrodomestico{

    int temperaturaMaxima;
    boolean poseeRegulador;

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
        System.out.println("Aumentando stock de Pava Eléctrica");
    }

    @Override
    public void descontarStock() {
        System.out.println("Descontando stock de Pava Eléctrica");
    }

    @Override
    public void vender() {
        System.out.println("Vendiendo Pava Eléctrica");
    }


}
