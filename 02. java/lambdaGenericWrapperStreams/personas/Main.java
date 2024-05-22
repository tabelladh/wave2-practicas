/*
Se tiene una lista de personas con sus respectivas edades, de los cuales se conoce su id, nombre y edad
(Crear la clase Persona con estos atributos).Se debe cargar la lista al azar, para luego:
Mostrar las personas mayores de 30 años.
Obtener la sumatoria de edades de las personas mayores de 30 años.
Mostrar las personas mayores de 30 años ordenadas por edad.
Para el tratamiento de la colección de datos (Por ejemplo, List), se puede utilizar stream.
Se puede utilizar filter para encontrar las personas según la edad.
Recordar el manejo de la programación funcional con las expresiones lambda.
*/

package org.example.lambdaGenericWrapperStreams.personas;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1, "Juan", 25));
        personas.add(new Persona(2, "María", 35));
        personas.add(new Persona(3, "Pedro", 40));
        personas.add(new Persona(4, "Ana", 20));
        personas.add(new Persona(5, "Luis", 45));

        System.out.println("Personas mayores de 30 años:");
        personas.stream()
                .filter(persona -> persona.getEdad() > 30)
                .forEach(persona -> System.out.println(persona.getNombre()));

        int sumatoriaEdadesMayores30 = personas.stream()
                .filter(persona -> persona.getEdad() > 30)
                .mapToInt(Persona::getEdad)
                .sum();
        System.out.println("Sumatoria de edades de personas mayores de 30 años: " + sumatoriaEdadesMayores30);

        System.out.println("Personas mayores de 30 años ordenadas por edad:");
        personas.stream()
                .filter(persona -> persona.getEdad() > 30)
                .sorted(Comparator.comparingInt(Persona::getEdad))
                .forEach(persona -> System.out.println(persona.getNombre() + " - Edad: " + persona.getEdad()));
    }
}
