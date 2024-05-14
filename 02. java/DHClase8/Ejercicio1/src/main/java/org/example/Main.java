package org.example;

public class Main {
    public static void main(String[] args) {
        HornoElectrico horno = new HornoElectrico("H1", "Horno Eléctrico", "MarcaX", "ModeloA",
                "Horno eléctrico para cocina", 10, 200.0, 300.0, 250, true, true);
        horno.vender();

        PavaElectrica pava = new PavaElectrica("P1", "Pava Eléctrica", "MarcaY", "ModeloB",
                "Pava eléctrica con regulador de temperatura", 15, 50.0, 80.0, 100, true);
        pava.vender();

        Microondas microondas = new Microondas("M1", "Microondas", "MarcaZ", "ModeloC",
                "Microondas con bandeja giratoria", 20, 150.0, 200.0, "Grande", true);
        microondas.vender();
    }
}