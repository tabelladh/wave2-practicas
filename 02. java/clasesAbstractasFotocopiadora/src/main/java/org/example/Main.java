package org.example;

public class Main {
    public static void main(String[] args) {
        Curriculum curriculum = new Curriculum();
        curriculum.setId_documento(1);
        curriculum.setNombrePersona("Pepe");
        curriculum.setDni(1234567);
        curriculum.setTituloUniversitario("Programador");
        curriculum.setAniosExperiencia(1);
        curriculum.imprimir();

        Libro libro = new Libro();
        libro.setId_documento(2);
        libro.setCantPaginas(100);
        libro.setTitulo("La punta de la mesa redonda");
        libro.setAutor("Garcia Marquez");
        libro.setGenero("Comedia");
        libro.imprimir();

        Informe informe = new Informe();
        informe.setId_documento(3);
        informe.setContenido("Resultado del estudio de matematica aplicada");
        informe.setAutor("Garcia Mar");
        informe.setCantPaginas(100);
        informe.setRevisor("Dr. Chapatin");
        informe.imprimir();
    }
}