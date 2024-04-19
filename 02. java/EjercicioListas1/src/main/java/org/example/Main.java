package org.example;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer,String> guardaRopa = new HashMap<>();
        guardaRopa.put(1, "Buzo Nike");
        guardaRopa.put(2, "Tapado Perramus");
        guardaRopa.put(3, "Saco Lacoste");
        guardaRopa.put(4, "Campera La Dolfina");

        for (Map.Entry<Integer,String> entrada  : guardaRopa.entrySet()) {
            Integer identificador = entrada.getKey();
            String prenda  = entrada.getValue();
            System.out.println(identificador + " - " + prenda);

        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de Ticket: ");
        int numeroTicket = scanner.nextInt();

        if (guardaRopa.containsKey(numeroTicket)) {
            String prenda = guardaRopa.get(numeroTicket);

            guardaRopa.remove(numeroTicket);
            System.out.println("Usted habia guardado la prenda: " + prenda + ". El ticket " + numeroTicket + " ha sido eliminado correctamente.");
        } else {

            System.out.println("El ticket " + numeroTicket + " no existe.");
        }
    }
}