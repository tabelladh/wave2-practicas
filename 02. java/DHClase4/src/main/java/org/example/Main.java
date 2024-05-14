package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ArrayList<ArrayList<String>>> prendas = new ArrayList<>();

        // Aca vamos a estar creando las prendas una por una manualmente
        ArrayList<String> prenda1 = new ArrayList<>();
        prenda1.add("Nike");
        prenda1.add("Camiseta");

        ArrayList<String> prenda2 = new ArrayList<>();
        prenda2.add("Adidas");
        prenda2.add("Pantalón");

        ArrayList<String> prenda3 = new ArrayList<>();
        prenda3.add("Reebok");
        prenda3.add("Zapatilla");

        ArrayList<String> prenda4 = new ArrayList<>();
        prenda4.add("Vans");
        prenda4.add("Zapatilla");

        ArrayList<String> prenda5 = new ArrayList<>();
        prenda5.add("Adidas");
        prenda5.add("Camiseta");

        // Aca vamos a agregar las prendas a la lista y guardarlas por indice
        prendas.add(new ArrayList<>());
        prendas.get(0).add(prenda1);
        prendas.get(0).add(prenda2);

        prendas.add(new ArrayList<>());
        prendas.get(1).add(prenda3);
        prendas.get(1).add(prenda4);
        prendas.get(1).add(prenda5);

        // Mostrar todas las prendas guardadas
        System.out.println("Prendas en el guardarropa:");
        for (int i = 0; i < prendas.size(); i++) {
            System.out.println("Número identificador: " + i);
            System.out.println("Prendas:");
            for (ArrayList<String> prenda : prendas.get(i)) {
                System.out.println("Marca: " + prenda.get(0) + ", Modelo: " + prenda.get(1));
            }
            System.out.println();
        }

        // Consultar prendas por número
        int numeroConsulta = 1; // Desde aca podemos ver si existen o no prendas guardadas bajo el número identificador
        if (numeroConsulta < prendas.size()) {
            ArrayList<ArrayList<String>> prendasConsultadas = prendas.get(numeroConsulta);
            System.out.println("\nPrendas bajo el número identificador " + numeroConsulta + ":");
            for (ArrayList<String> prenda : prendasConsultadas) {
                System.out.println("Marca: " + prenda.get(0) + ", Modelo: " + prenda.get(1));
            }
        } else {
            System.out.println("No hay prendas guardadas bajo el número identificador " + numeroConsulta);
        }



        /*
        * import java.util.*;

        public class Main {
        public static void main(String[] args) {

        List<String[][]> prendas = new ArrayList<>();
        HashMap<Integer, List<String[][]>> guardaropa = new HashMap<>();

        String[][] prendax = {
                {"DOLCE", "INVIERNO_2024"},
                {"GUCCI", "PRIMAVERA_2024"},
                {"PRADA", "OTOÑO_2024"}
        };

        prendas.add(prendax.clone());
        guardaropa.put((guardaropa.size()+1), prendas);
        int operacionId = guardaropa.size();
        prendax = new String[][] {                {"DOLCE", "INVIERNO_2024_22222"}        };
        prendas=new ArrayList<>();
        prendas.add(prendax);
        guardaropa.put((guardaropa.size()+1), prendas);

        //Muestra todo el guardarropas
        for (Map.Entry<Integer, List<String[][]> > listaPrendas : guardaropa.entrySet()) {

            System.out.println("Para el indice: " + listaPrendas.getKey() + " y sus prendas son las que siguen: " );
            for (String[][] matriz : listaPrendas.getValue()) {

                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        System.out.print(matriz[i][j] + " ");
                    }
                    System.out.println();
                }

                System.out.println();
            }

        }

        //Mostrar prenda para un indice particular
        Integer indiceElegido = 1;
        System.out.println("Para el indice: " + indiceElegido + " y sus prendas son las que siguen: " );
        for (String[][] matriz : guardaropa.get(indiceElegido)) {

                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        System.out.print(matriz[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
        }
    }
}
*/
    }
}
