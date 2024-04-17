package org.example;

public class Temperaturas {
    public static void main(String[] args) {

        String[] ciudades = {
                "Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción",
                "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"
        };


        int[][] temperaturas ={ {-2, 33},{-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};


        int tempMax = temperaturas[0][1];
        int tempMin = temperaturas[0][0];
        String ciudadTempMax = ciudades[0];
        String ciudadTempMin = ciudades[0];


        for (int i = 1; i < temperaturas.length; i++) {

            int tempMaxCiudad = temperaturas[i][1];

               int tempMinCiudad = temperaturas[i][0];


            if (tempMaxCiudad > tempMax) {
                tempMax = tempMaxCiudad;
                ciudadTempMax = ciudades[i];

            }


            if (tempMinCiudad < tempMin) {
                tempMin = tempMinCiudad;
                ciudadTempMin = ciudades[i];
            }
        }


        System.out.println("La temperatura máxima fue de " + tempMax + " ºC en " + ciudadTempMax);

        System.out.println("La temperatura mínima fue de " + tempMin + " ºC en " + ciudadTempMin);
    }
}
