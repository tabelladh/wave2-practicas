package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear lista de personas
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1, "Juan", 25));
        personas.add(new Persona(2, "María", 40));
        personas.add(new Persona(3, "Pedro", 35));
        personas.add(new Persona(4, "Ana", 50));
        personas.add(new Persona(5, "Luis", 20));

        // Mostrar todas las personas ordenadas por edad, de menor a mayor
        System.out.println("Todas las personas ordenadas por edad, de menor a mayor:");
        personas.stream()
                .sorted(Comparator.comparingInt(Persona::getEdad))
                .forEach(persona -> System.out.println("ID: " + persona.getId() + ", Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad()));

        // Mostrar las personas mayores de 30 años
        System.out.println("\nPersonas mayores de 30 años:");
        personas.stream()
                .filter(persona -> persona.getEdad() > 30)
                .forEach(persona -> System.out.println("ID: " + persona.getId() + ", Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad()));

        // Obtener la sumatoria de edades de las personas mayores de 30 años
        int sumatoriaEdades = personas.stream()
                .filter(persona -> persona.getEdad() > 30)
                .mapToInt(Persona::getEdad)
                .sum();
        System.out.println("\nSumatoria de edades de personas mayores de 30 años: " + sumatoriaEdades);

        // Mostrar las personas mayores de 30 años ordenadas por edad
        System.out.println("\nPersonas mayores de 30 años ordenadas por edad:");
        personas.stream()
                .filter(persona -> persona.getEdad() > 30)
                .sorted((p1, p2) -> p1.getEdad() - p2.getEdad())
                .forEach(persona -> System.out.println("ID: " + persona.getId() + ", Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad()));
    }

}
