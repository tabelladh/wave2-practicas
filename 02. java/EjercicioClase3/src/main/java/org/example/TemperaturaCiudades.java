package org.example;

public class TemperaturaCiudades {
    public static void main(String[] args) {

        String[] ciudades = {
                "Londres",
                "Madrid",
                "Nueva York",
                "Buenos Aires",
                "Asunción",
                "São Paulo",
                "Lima",
                "Santiago de Chile",
                "Lisboa",
                "Tokio"
        };
        int[][] temperaturas = {
                {-2, 33},
                {-3, 32},
                {-8, 27},
                {4, 37},
                {6, 42},
                {5, 43},
                {0, 39},
                {-7, 26},
                {-1, 31},
                {-10, 35}
        };

        int menorTemp = 0;
        int mayorTemp = 0;
        String ciudadMasFria = "";
        String ciudadMasCalida= "";

        for (int i = 0; i < ciudades.length; i++) {
            if (temperaturas[i][0] < menorTemp) {
                menorTemp = temperaturas[i][0];
                ciudadMasFria = ciudades[i];
            }
            if (temperaturas[i][1] > mayorTemp) {
                mayorTemp = temperaturas[i][1];
                ciudadMasCalida = ciudades[i];
            }
        }

        System.out.println("La ciudad con la temperatura más baja es " + ciudadMasFria + ", la misma es de " + menorTemp + " °C.");
        System.out.println("La ciudad con la temperatura más alta es " + ciudadMasCalida + ", la misma es de " + mayorTemp + " °C.");

    }
}