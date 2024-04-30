package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Persona> listaPersonas = new ArrayList<Persona>();

        Persona persona1 = new Persona(1, "Alejandro", 30);
        Persona persona2 = new Persona(2, "Juan", 20);
        Persona persona3 = new Persona(3, "German", 55);
        Persona persona4 = new Persona(4, "Leo", 40);
        Persona persona5 = new Persona(5, "Juan", 22);
        Persona persona6 = new Persona(6, "German", 40);

        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);
        listaPersonas.add(persona4);
        listaPersonas.add(persona5);
        listaPersonas.add(persona6);

        // Mostar las personas mayores de 30 años

        listaPersonas.stream()
           .filter(persona -> persona.getEdad() > 30)
           .forEach(System.out::println);

        // Obtener la sumatoria de edad de las personas mayores de 30 años

        var sumatoria = listaPersonas.stream()
           .filter(persona -> persona.getEdad() > 30)
           .mapToInt(Persona::getEdad)
           .sum();

        System.out.println("La sumatoria de las edades de las personas mayores de 30 años es: " + sumatoria + " años");

    }
}