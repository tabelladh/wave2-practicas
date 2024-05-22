package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GuardaRopa guardaRopa = new GuardaRopa();

        Prenda prenda1 = new Prenda("Nike", "Remera");
        Prenda prenda2 = new Prenda("Adidas", "Pantalón");

        Integer numeroIdentificador = guardaRopa.guardarPrendas(Arrays.asList(prenda1, prenda2));
        System.out.println("Tiene el numero de guardaropa: " + numeroIdentificador);

        guardaRopa.mostrarPrendas();

        List<Prenda> prendasRecuperadas = guardaRopa.devolverPrendas(numeroIdentificador);
        System.out.println("\nPrendas a devolver bajo el numero " + numeroIdentificador + " son:");
        for (Prenda prenda : prendasRecuperadas) {
            System.out.println("Marca: " + prenda.marca + ", Modelo: " + prenda.modelo);
        }
    }
}
