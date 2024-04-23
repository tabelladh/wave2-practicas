package org.example;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 = new Persona(30865756, "Leo", 37, 50, 180);


        int documento = persona1.getDni();
        System.out.println(documento); // no tiene valores

        persona1.setEdad(19);
        System.out.println(persona1.getEdad()); // coloca el valor nuevo

        int altura = persona2.getAltura();
        System.out.println(altura); // Obtengo su altura

        persona2.setPeso(45);
        System.out.println(persona2.getPeso()); // lo sobreescribe


    }
}