package org.example;

public class Main {
    public static void main(String[] args) {

        Libro libro = new Libro("L001", "El principito", 1943, "Antoine de Saint-Exupéry");
        libro.prestar();

        Mapa mapa = new Mapa("M001", "Mapa de Europa", 2020, "Político", "Grande");
        mapa.utilizarEnBiblioteca();

        Revista revista = new Revista("R001", "National Geographic", 2021, 12, "Diciembre");
        revista.devolverEnBiblioteca();

    }
}