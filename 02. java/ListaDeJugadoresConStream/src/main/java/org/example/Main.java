package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Jugador> jugadores = new ArrayList<Jugador>();

        Jugador jugador1 = new Jugador(1, "Alejandro", "Delantero");
        Jugador jugador2 = new Jugador(2, "Juan", "Defensor");
        Jugador jugador3 = new Jugador(3, "Pedro", "Mediocampo");
        Jugador jugador4 = new Jugador(4, "Maria", "Punta");
        Jugador jugador5 = new Jugador(5, "Jose", "9 goleador");

        jugadores.add(jugador1);
        jugadores.add(jugador2);
        jugadores.add(jugador3);
        jugadores.add(jugador4);
        jugadores.add(jugador5);

        // ORDENAR Y MOSTRAR LA LISTA POR LOS NOMBRES DE LOS JUGADORES
        jugadores.stream().
                sorted(Comparator.comparing(Jugador::getNombre))
                .forEach(System.out::println);

        // ORDENAR Y MOSTRAR LA LISTA POR LAS POSICIONES DE LOS JUGADORES
        System.out.println("-----------------");
        jugadores.stream().
                sorted(Comparator.comparing(Jugador::getPosicion))
                .forEach(System.out::println);










    }
}