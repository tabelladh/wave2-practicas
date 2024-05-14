package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear lista de jugadores
        List<Jugador> jugadores = new ArrayList<>();
        jugadores.add(new Jugador(1, "Juan", 3));
        jugadores.add(new Jugador(2, "María", 1));
        jugadores.add(new Jugador(3, "Pedro", 2));
        jugadores.add(new Jugador(4, "Ana", 4));
        jugadores.add(new Jugador(5, "Luis", 5));

        // Ordenar y mostrar la lista por los nombres de los jugadores
        System.out.println("Lista de jugadores ordenada por nombre:");
        jugadores.stream()
                .sorted(Comparator.comparing(Jugador::getNombre))
                .forEach(jugador -> System.out.println("ID: " + jugador.getId() + ", Nombre: " + jugador.getNombre() + ", Posición: " + jugador.getPosicion()));

        // Ordenar y mostrar la lista según las posiciones de los jugadores
        System.out.println("\nLista de jugadores ordenada por posición:");
        jugadores.stream()
                .sorted(Comparator.comparingInt(Jugador::getPosicion))
                .forEach(jugador -> System.out.println("ID: " + jugador.getId() + ", Nombre: " + jugador.getNombre() + ", Posición: " + jugador.getPosicion()));
    }
}
