package org.example;

public class Main {
    public static void main(String[] args) {

        HornoElectrico hornoElectrico = new HornoElectrico(1000, "HornoElectric", "Electric", "Electric", "Horno para el Hogar", 2500, 10000, 15999, 1500, true, false);
        PavaElectrica pavaElectrica = new PavaElectrica(1850, "Pava Electrica", "Peabody", "Pava1000", "Pava para el hogar", 3400, 50, 15999, 90, false);
        Microondas microondas = new Microondas(2200, "Microondas", "Samsung", "MicroSamg", "Microondas para el Hogar", 1500, 23000, 500000, 20, false);

        System.out.println(hornoElectrico);
        System.out.println(hornoElectrico.vender());

        System.out.println("-----------------------");

        System.out.println(pavaElectrica);
        System.out.println(pavaElectrica.vender());

        System.out.println("-----------------------");

        System.out.println(microondas);
        System.out.println(microondas.vender());
    }
}