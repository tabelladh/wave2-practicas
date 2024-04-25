package org.example;

public class Main {
    public static void main(String[] args) {
        HornoElectrico horno = new HornoElectrico();
        horno.vender();

        PavaElectrica pava = new PavaElectrica();
        pava.vender();

        Microondas microondas = new Microondas();
        microondas.vender();

    }
}