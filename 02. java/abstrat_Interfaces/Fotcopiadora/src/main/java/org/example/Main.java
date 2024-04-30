package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curriculum e = new Curriculum(11,"Joako", 221122, "Desarrollador", 1);
        System.out.println(e.imprimir());

        LibroEnPDF b = new LibroEnPDF(05,220, "Final Eterna", "El Muñe", "Suspenso");
        System.out.println(b.imprimir());

        Informe c = new Informe(3, "Fulbito", 66, "El Pity", "Gallardo");
        System.out.println(c.imprimir());
    }
}