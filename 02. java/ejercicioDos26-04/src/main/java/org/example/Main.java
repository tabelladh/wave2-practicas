package org.example;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Jugador jugador1 = new Jugador(1,"matias",1);
        Jugador jugador2 = new Jugador(2,"susano",2);
        Jugador jugador3 = new Jugador(3,"benja",3);

        List<Jugador>jugadores = List.of(jugador1,jugador2,jugador3);

        jugadores.stream()
                .sorted(Comparator.comparing(Jugador::getNombre))
                .forEach(System.out::println);

        jugadores.stream()
                .sorted(Comparator.comparing(Jugador::getPosicion))
                .forEach(System.out::println);
    }
}