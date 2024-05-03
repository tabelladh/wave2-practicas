package org.example;

public class Main {
    public static void main(String[] args) {

        Mapa mapa = new Mapa(12,2010,"argentina","politico",4);

        System.out.println(mapa);
        System.out.println(mapa.utilizarEnBiblioteca());

    }
}