package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> listprendas = new ArrayList<>();

        // Agregar algunas prendas al ArrayList
        listprendas.add("Nike Air Max");
        listprendas.add("Adidas Superstar");
        listprendas.add("Puma RS-X");

        // HashMap para almacenar las prendas
        HashMap<Integer, String> prendas = new HashMap<>();

        // Agregar las prendas al HashMap
        for (int i = 0; i < listprendas.size(); i++) {
            prendas.put(i, listprendas.get(i));
        }
        // Iterar sobre el HashMap e imprimir las prendas
        for (Integer i : prendas.keySet()) {
            System.out.println("Ticket num " + i + ", Prenda: " + prendas.get(i));
        }
        // Obtener una prenda con num de ticket
        System.out.println("Que numero de ticket tiene:");

        Scanner scanner = new Scanner(System.in);
        int ticket =  scanner.nextInt();

        // Verificar si el identificador está presente en el HashMap
        if (prendas.containsKey(ticket)) { // si existe el ticket en el mapa
            // Obtener y mostrar la prenda asociada al identificador
            String prenda = prendas.get(ticket); // obtener el valor asociado a esa posicion
            System.out.println("La prenda asociada al ticket " + ticket + " es: " + prenda);
        } else {
            System.out.println("El ticket ingresado no está asociado a ninguna prenda.");
        }

    }
}