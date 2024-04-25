package org.example;

public class HornoElectrico extends Electrodomestico {


    private int temperaturaMaxima;
    private boolean poseeGrill;
    private boolean poseeAutolimpieza;

    public int getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(int temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public boolean isPoseeGrill() {
        return poseeGrill;
    }

    public void setPoseeGrill(boolean poseeGrill) {
        this.poseeGrill = poseeGrill;
    }

    public boolean isPoseeAutolimpieza() {
        return poseeAutolimpieza;
    }

    public void setPoseeAutolimpieza(boolean poseeAutolimpieza) {
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
}
