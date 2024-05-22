package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Libro libro = new Libro(1, "100 años de soledad", 2022, "Garcia Marquez", true);
        Revista revista = new Revista(2, "Revista Anteojito", 1992, 1, "Octubre");
        Mapa mapa = new Mapa(3, "Mapa de Argentina", 2022, "Politico", 3);

        System.out.println(libro);
        System.out.println(mapa);
        System.out.println(revista);

        System.out.println("________________________________________________________________");

        System.out.println(libro.prestar());
        System.out.println(mapa.utilizarEnBiblioteca());
        System.out.println(revista.utilizarEnBiblioteca());
        System.out.println(revista.devolverEnBiblioteca());

    }
}