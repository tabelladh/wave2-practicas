package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curriculum cv = new Curriculum (12, "Melissa", 39090899, "Tecnico Universitario en Programación", 1);
        cv.imprimir();
        LibroPdf libro = new LibroPdf (13, 120, "Cronica de una muerte anunciada", "Gabriel García Marquez", "drama");
        libro.imprimir();
        Informe informe = new Informe(14, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed euismod, " +
                "libero sed commodo facilisis, justo magna convallis neque, eget ullamcorper odio arcu sit amet sapien. Mauris eget leo " +
                "ut ex vestibulum lobortis. Donec vitae dui in tortor ultrices euismod. Nam tincidunt sapien eu mi tincidunt, eget scelerisque " +
                "lacus tempus. Nulla facilisi. Maecenas non risus vel ante rutrum malesuada.", 5, "Castaño Jose",
                "Gomez Adriana");
        informe.imprimir();
    }
}