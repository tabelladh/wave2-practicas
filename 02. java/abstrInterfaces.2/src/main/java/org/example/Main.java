package org.example;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("1234", "Bajo este sol tremendo", 2019, "Busket", true);
        System.out.println(libro1.mostrarAtributos());

        System.out.println(libro1.prestar());

        Mapa mapa1 = new Mapa("1212", "Mapa Argentina", 2010, "politico", "a4", true);
        System.out.println(mapa1.mostrarAtributos());
        System.out.println(mapa1.utilizarEnBiblioteca());

        Revista revista1 = new Revista("12123", "Revista Gente", 2024, 2, 6, false);
        System.out.println(revista1.mostrarAtributos());
        System.out.println(revista1.devolverEnBiblioteca());

    }
}