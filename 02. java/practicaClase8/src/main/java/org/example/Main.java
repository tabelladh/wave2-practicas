package org.example;

public class Main {
    public static void main(String[] args) {

        String[] ciudades = {
                "Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción",
                "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"
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


        int tempMin = Integer.MAX_VALUE;
        int tempMax = Integer.MIN_VALUE;

        int indiceTempMin = -1;
        int indiceTempMax = -1;


        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i][0] < tempMin) {
                tempMin = temperaturas[i][0];
                indiceTempMin = i;
            }
            if (temperaturas[i][1] > tempMax) {
                tempMax = temperaturas[i][1];
                indiceTempMax = i;
            }
        }

        System.out.println("La menor temperatura la tuvo " + ciudades[indiceTempMin] + ", con " + tempMin + " °C.");

        System.out.println("La mayor temperatura la tuvo " + ciudades[indiceTempMax] + ", con " + tempMax + " °C.");
    }
}
