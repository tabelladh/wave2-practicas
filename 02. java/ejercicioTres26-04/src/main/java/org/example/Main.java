package org.example;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona(1,"matias",33);
        Persona persona2 = new Persona(2,"prisci",28);
        Persona persona3 = new Persona(3,"sergio",62);

        List<Persona>personas = List.of(persona1,persona2,persona3);

        personas.stream()
                .filter(p -> p.getEdad() > 30)
                .forEach(System.out::println);

        int sumador = personas.stream()
                .filter(persona -> persona.getEdad() > 30)
                .mapToInt(Persona::getEdad)
                .sum();
        System.out.println(sumador);

        personas.stream()
                .filter(p -> p.getEdad() > 30)
                .sorted(Comparator.comparing(Persona::getEdad))
                .forEach(System.out::println);

    }
}