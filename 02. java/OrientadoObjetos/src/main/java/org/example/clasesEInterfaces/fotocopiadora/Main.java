/*
Una fotocopiadora plantea desarrollar un programa que permita imprimir diferentes tipos de documentos.
Entre los tipos de documentos se encuentran:
Curriculums Atributos: nombrePersona, DNI, tituloUniversitario, años de experiencia
Libros en PDF Atributos: cantidad de páginas, título, autor y género.
Informes Atributos: Incluyen contenido, cantidad de páginas, autor, y revisor.
Cada uno de estos documentos tienen en común el atributo id_documento y el método imprimir();
sin embargo éste último es implementado de manera diferente en cada documento:
En el caso de los curriculums, al llamar al método imprimir se debe mostrar cada uno de los atributos del objeto.
En el caso de los libros, al llamar al método imprimir se debe mostrar título y autor.
En el caso de los informes, al llamar al método imprimir sólo se debe mostrar el contenido.
*/

package org.example.clasesEInterfaces.fotocopiadora;

public class Main {
    public static void main(String[] args) {
        System.out.print("\n");
        System.out.println("Imprimiendo CV");
        Curriculum curriculum = new Curriculum("001", "Juan Perez", "12345678", "Ingeniero", 5);
        curriculum.imprimir();
        System.out.print("\n");
        System.out.println("Imprimiendo libro PDF");
        LibroPDF libro = new LibroPDF("002", "El Quijote", "Miguel de Cervantes", "Novela", 300);
        libro.imprimir();
        System.out.print("\n");
        System.out.println("Imprimiendo informe");
        Informe informe = new Informe("003", "Análisis financiero del trimestre", "Ana López", "Pedro Gómez", 10);
        informe.imprimir();
    }
}