package org.example;

public class Main {
    public static void main(String[] args) {

        Curriculums curr = new Curriculums(1000, "Alexander", 30800111, " Ingeniero", 30);
        Informes informes = new Informes(1200, "Mensual", 1200, "Pepe", "Manuel");
        Libros libro = new Libros(500, 250, "Ale seravalle", "Segunda Guerra", "Informes");

        System.out.println(curr.imprimir());
        System.out.println(informes.imprimir() );
        System.out.println(libro.imprimir());

    }
}