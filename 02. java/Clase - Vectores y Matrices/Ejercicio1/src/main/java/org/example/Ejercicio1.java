package org.example;

public class Ejercicio1 {
    public static void main(String[] args) {
        String[] ciudades = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción",
                "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};

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

        int tempMin = temperaturas[0][0];
        int tempMax = temperaturas[0][1];
        String ciudadTempMin = ciudades[0];
        String ciudadTempMax = ciudades[0];

        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i][0] < tempMin) {
                tempMin = temperaturas[i][0];
                ciudadTempMin = ciudades[i];
            }
            if (temperaturas[i][1] > tempMax) {
                tempMax = temperaturas[i][1];
                ciudadTempMax = ciudades[i];
            }
        }
        System.out.println("La menor temperatura fue " + tempMin + " ºC y la tuvo " + ciudadTempMin);
        System.out.println("La mayor temperatura fue " + tempMax + " ºC y la tuvo " + ciudadTempMax);
    }
}

