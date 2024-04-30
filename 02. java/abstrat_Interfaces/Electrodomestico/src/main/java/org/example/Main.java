package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Electrodomestico[] electrodomesticos = new Electrodomestico[3];
        electrodomesticos[0] = new Microonda(10,"Microndas", "Atma", "g2300", "micro electrico", 5, 1000, 3200, 1, true);
        electrodomesticos[1] = new HornoElectrico(12,"Hornos", "Samsung", "f22", "horno electrico", 8, 2000, 4500, 250, true, false);
        electrodomesticos[2] = new PavaElectrica(11,"Pavas", "Liliana", "x55", "pava electrica", 2, 700, 1800, 100, true);

        for (Electrodomestico electrodomestico : electrodomesticos) {
            electrodomestico.vender();
        }
    }
}