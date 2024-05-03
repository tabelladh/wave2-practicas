package org.example;

public class Main {
    public static void main(String[] args) {

        Electrodomestico horno = new HornoElectrico(1,5,"lg","super",
                "es un horno",15.5,35.9,250,
                true,false);

        horno.vender();
        System.out.println(horno);

    }
}