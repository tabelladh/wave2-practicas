package org.example;


public class Main {
    public static void main(String[] args) {
        //Estructuras de control y Arreglos
        //// Práctica integradora
        //Estructuras de control y Arreglos // Práctica integradora
        //Temperaturas Globales
        //Un portal de noticias tiene registrados datos de las diferentes temperaturas que obtuvieron algunas ciudades
        // del mundo durante el año pasado; a partir de estos registros, pudieron determinar la más baja y la más alta
        // para cada una de las ciudades. Por ejemplo, se determinó que para Londres, la mínima fue de -2º C y la
        // máxima de 33º C. Sin embargo, actualmente necesitan armar una noticia en donde especifiquen cuál es la
        // temperatura máxima que hubo entre todas las ciudades registradas y cuál fue la mínima. Para ello cuentan
        // con un vector con los nombres de cada una de las ciudades y una matriz de dos columnas que especifican
        // su temperatura máxima y mínima, los cuales se especifican a continuación:
        //Sabiendo que cada índice de fila representa a una ciudad. Se necesita conocer la mayor y la menor temperatura
        // entre todas las ciudades; al mismo tiempo se deberá especificar el nombre de la ciudad. Por ejemplo,
        // la menor temperatura la tuvo Tokio, con -10 º C.

        // Vector de ciudades
        String[] ciudades = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción",
                "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};

        int[][] temperaturas = {{-2, 33},{-3, 32},{-8, 27},{4, 37},{6, 42},{5, 43},{0, 39},{-7, 26},{-1, 31},{-10, 35}};

        //De esta manera dejamos como tempMax y tempMin un 0, para tenerlas de referencia y poder trabajar
        //y que las pise al recorrer los arreglos
        int tempMax = 0;
        int tempMin = 0;
        String ciudadTempMax = "";
        String ciudadTempMin = "";

        //Recorremos los arreglos utilizando un for, para buscar la temperatura maxima y minima, usando un condicional
        // podemos verificar cual es la mayor y la menor y asi guardarla en las variables tempMax y tempMin
        // y usando i como indice para coincidir con la posicion del arreglo de temperaturas, para saber la ciudad
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i][1] > tempMax) {
                tempMax = temperaturas[i][1];
                ciudadTempMax = ciudades[i];
            }
            if (temperaturas[i][0] < tempMin) {
                tempMin = temperaturas[i][0];
                ciudadTempMin = ciudades[i];
            }
        }

        System.out.println("La temperatura máxima registrada fue de " + tempMax + " ºC en " + ciudadTempMax);
        System.out.println("La temperatura mínima registrada fue de " + tempMin + " ºC en " + ciudadTempMin);
    }
}
