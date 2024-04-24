package org.example;

public class Main {
    public static void main(String[] args) {


        Cuadrado cuadrado = new Cuadrado(4, 5.0);

        Circulo circulo = new Circulo(1, 5.0);

        System.out.println(cuadrado.calcularArea());
        System.out.println(circulo.calcularArea());

        ProfesorPractica profesorPractica = new ProfesorPractica("Jorge");
        ProfesorTeoria profesorTeoria = new ProfesorTeoria("Juan");

        System.out.println(profesorPractica.darClase());
        System.out.println(profesorTeoria.darClase());

        System.out.println(profesorTeoria.tomarAsistencia());
        System.out.println(profesorPractica.tomarAsistencia());
        

    }
}