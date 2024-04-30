package org.example;

import java.util.Arrays;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //EJERCICIO 1
//        Lavado kbza = new Lavado(1, "Joako", "Lavado cabeza completa");
//        System.out.println(kbza.getNombre() + " Con el ID: " + kbza.getId() + " Viene por un " + kbza.observacion);
//
//        Corte melena = new Corte("Cortesaki", "Joako", "Rapado");
//        System.out.println(melena.getNombre() + " Viene por un " + melena.getId()+ " de tipo: " + melena.tipo );


        //EJERCICIO 2
        Jugador[] jugadores = new Jugador[5];
        jugadores[0] = new Jugador(1, "Joako", 4);
        jugadores[1] = new Jugador(2, "Juan", 1);
        jugadores[2] = new Jugador(3, "Maria", 2);
        jugadores[3] = new Jugador(4, "Pedro", 5);
        jugadores[4] = new Jugador(5, "Ana", 3);

        
    }
}