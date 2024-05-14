package org.example;


public class Main {
    public static void main(String[] args) {
        Curriculum curriculum = new Curriculum(001, "Juan Perez", "12345678", "Ingeniero", 5);
        curriculum.imprimir();

        LibroPDF libro = new LibroPDF(002, "El Principito", "Antoine de Saint-Exupéry", 100, "Ficción");
        libro.imprimir();

        Informe informe = new Informe(003, "Análisis financiero del trimestre", "Ana López", "Pedro Gomez", 20);
        informe.imprimir();
    }
}
