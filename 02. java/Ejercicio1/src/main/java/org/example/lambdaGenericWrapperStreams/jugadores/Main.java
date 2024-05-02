/*
Se tiene una lista de jugadores que compitieron en un juego de carreras, de los cuales se conoce su id,
nombre y posición (Crear la clase Jugador con estos atributos).
Se debe cargar la lista al azar, para luego:
Ordenar y mostrar la lista por los nombres de los jugadores.
Ordenar y mostrar la lista según las posiciones de los jugadores.
Para el tratamiento de la colección de datos (Por ejemplo, List), se puede utilizar stream.
Para el ordenamiento, se podría utilizar la función sorted con Comparator.
Recordar el manejo de la programación funcional con las expresiones lambda.
*/

package org.example.lambdaGenericWrapperStreams.jugadores;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Jugador> jugadores = new ArrayList<>();
        jugadores.add(new Jugador(1, "Juan", 3));
        jugadores.add(new Jugador(2, "María", 2));
        jugadores.add(new Jugador(3, "Pedro", 1));
        jugadores.add(new Jugador(4, "Ana", 4));
        jugadores.add(new Jugador(5, "Luis", 5));

        System.out.println("Lista ordenada por nombres:");
        jugadores.stream()
                .sorted(Comparator.comparing(Jugador::getNombre))
                .forEach(jugador -> System.out.println(jugador.getNombre()));
        System.out.println();

        System.out.println("Lista ordenada por posiciones:");
        jugadores.stream()
                .sorted(Comparator.comparingInt(Jugador::getPosicion))
                .forEach(jugador -> System.out.println(jugador.getNombre()));
    }
}