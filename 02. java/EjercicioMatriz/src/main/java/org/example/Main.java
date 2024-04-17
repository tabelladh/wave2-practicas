package org.example;

public class Main {
    public static void main(String[] args) {

        int tempMax = 0;
        int tempMin = 0;
        String ciudadTempMax = "";
        String ciudadTempMin = "";

        String[] ciudades = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asuncion", "Sao Paulo",
        "Lima", "Santiago de Chile", "Lisboa", "Tokio"};

        int [][] temperaturas = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26},
                {-1, 31}, {-10, 35}};



        for (int i = 0; i < ciudades.length ; i++) {
            if(temperaturas[i][0] < tempMin) {
                tempMin = temperaturas[i][0];
                ciudadTempMin = ciudades[i];
            }
            if(temperaturas[i][1] > tempMax) {
                tempMax = temperaturas[i][1];
                ciudadTempMax = ciudades[i];
            }
        }

        System.out.println("La tempertura minima es " + tempMin + "°C y la registro la ciudad de " + ciudadTempMin);
        System.out.println("La temperatura maxima es " + tempMax + "°C y la registro la ciudad de " + ciudadTempMax);



    }
}