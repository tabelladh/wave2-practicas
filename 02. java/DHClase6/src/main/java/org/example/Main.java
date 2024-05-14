package org.example;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();

        Persona persona1 = new Persona(12345678, "Juan", 30, 70.5, 1.75);
        Persona persona2 = new Persona();

        persona2.setDni(87654321);
        persona2.setNombre("Maria");
        persona2.setEdad(25);
        persona2.setPeso(60.5);
        persona2.setAltura(1.65);


        personas.add(persona1);
        personas.add(persona2);

        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("DNI: " + persona.getDni());
            System.out.println("Edad: " + persona.getEdad());
            System.out.println("Peso: " + persona.getPeso());
            System.out.println("Altura: " + persona.getAltura());
            System.out.println();
        }

    }
}