package org.example;

public class Main {
        public static void main(String[] args) {

            String[] ciudades = {"Londres",
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
                    {-2, 33}, {-3, 32}, {-8, 27},
                    {4, 37}, {6, 42}, {5, 43},
                    {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}
            };
            int tempMax = temperaturas [0][1];
            int tempMin = temperaturas [0][0];
            String ciudadMaxTemp = "";
            String ciudadMinTemp = "";

            for (int i = 0; i < temperaturas.length; i++){
                if(temperaturas[i][0] < tempMin){
                    tempMin = temperaturas [i][0];
                    ciudadMinTemp = ciudades[i];
                }
                if(temperaturas[i][0] > tempMax){
                    tempMax = temperaturas [i][0];
                    ciudadMaxTemp = ciudades[i];
                }
            }
            System.out.println("La ciudad con la temperatura mas alta es: " + ciudadMaxTemp + " la temperatura fue de: " + tempMax + "Cº");
            System.out.println("La ciudad con la temperatura mas baja es: " + ciudadMinTemp + " la temperatura fue de: " + tempMin + "Cº");
        }

    }

