package org.example;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("L1", "El Principito", 1943, "Antoine de Saint-Exupéry");
        libro.mostrarAtributos();
        libro.prestar();

        Mapa mapa = new Mapa("M1", "Mapa Mundial", 2020, "Político", "Grande");
        mapa.mostrarAtributos();
        mapa.utilizarEnBiblioteca();

        Revista revista = new Revista("R1", "National Geographic", 2021, 100, "Enero");
        revista.mostrarAtributos();
        revista.devolverEnBiblioteca();
    }
}
