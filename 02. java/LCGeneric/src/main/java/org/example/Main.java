package org.example;

public class Main {
    public static void main(String[] args) {

        Corte corte = new Corte("SUPERCORTE-1", "Corte", "Carre");
        Lavado lavado = new Lavado(1, "Lavado", "con Shampoo");

        System.out.println(corte);
        System.out.println(lavado);

    }
}