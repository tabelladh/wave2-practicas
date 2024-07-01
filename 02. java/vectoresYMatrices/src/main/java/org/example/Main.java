package org.example;


public class Main {
    public static void main(String[] args) {

        String[][] datosCiudades = new String[11][3];

        datosCiudades[0][0] = "Londres";
        datosCiudades[0][2] = "33";
        datosCiudades[0][1] = "-2";

        datosCiudades[1][0] = "Madrid";
        datosCiudades[1][2] = "32";
        datosCiudades[1][1] = "-3";

        datosCiudades[2][0] = "Nueva York";
        datosCiudades[2][2] = "27";
        datosCiudades[2][1] = "-8";

        datosCiudades[3][0] = "Buenos Aires";
        datosCiudades[3][2] = "37";
        datosCiudades[3][1] = "4";

        datosCiudades[4][0] = "Asuncion";
        datosCiudades[4][2] = "42";
        datosCiudades[4][1] = "6";

        datosCiudades[5][0] = "Sao Paulo";
        datosCiudades[5][2] = "43";
        datosCiudades[5][1] = "5";

        datosCiudades[6][0] = "Lima";
        datosCiudades[6][2] = "39";
        datosCiudades[6][1] = "0";

        datosCiudades[7][0] = "Nueva York";
        datosCiudades[7][2] = "27";
        datosCiudades[7][1] = "-8";

        datosCiudades[8][0] = "Santiago de chile";
        datosCiudades[8][2] = "26";
        datosCiudades[8][1] = "-7";

        datosCiudades[9][0] = "Lisboa";
        datosCiudades[9][2] = "31";
        datosCiudades[9][1] = "-1";

        datosCiudades[10][0] = "Tokio";
        datosCiudades[10][2] = "35";
        datosCiudades[10][1] = "-10";

        int tempMaxima = Integer.parseInt(datosCiudades[0][2]);
        int tempMinima = Integer.parseInt(datosCiudades[0][1]);
        String ciudadMaxima = datosCiudades[0][0];
        String ciudadMinima = datosCiudades[0][0];

        for (int i = 1; i < datosCiudades.length; i++) {
            int tempMaxActual = Integer.parseInt(datosCiudades[i][2]);
            int tempMinActual = Integer.parseInt(datosCiudades[i][1]);

            if (tempMaxActual > tempMaxima) {
                tempMaxima = tempMaxActual;
                ciudadMaxima = datosCiudades[i][0];
            }
            if (tempMinActual < tempMinima) {
                tempMinima = tempMinActual;
                ciudadMinima = datosCiudades[i][0];
            }
        }
        System.out.println("La temperatura máx fue de " + tempMaxima + "°C en " + ciudadMaxima + ".");
        System.out.println("La temperatura min fue de " + tempMinima + "°C en " + ciudadMinima + ".");
    }
}
