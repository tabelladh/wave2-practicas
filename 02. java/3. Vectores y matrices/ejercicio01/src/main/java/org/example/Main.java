package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String ciudades[] = {
            "Londres", "Madrid", "Nueva York", "Buenos Aires",
                "Asunción", "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"
        };

        int temperaturas [][] = {
                {-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42},
                {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}
        };

        int tempMayor = 0, tempMenor = 0, posicionMenor = 0, posicionMayor = 0;

        for(int i=0; i < ciudades.length; i++){
            if ( temperaturas[i][0] < tempMenor){
                tempMenor = temperaturas[i][0];
                posicionMenor = i;
            }
        }
        System.out.println("La menor temperatura es: " + tempMenor + ". En la ciudad de: "+ ciudades[posicionMenor]);

        for(int i=0; i < ciudades.length; i++){
            if ( temperaturas[i][1] > tempMayor){
                tempMayor = temperaturas[i][1];
                posicionMayor = i;
            }
        }
        System.out.println("La mayor temperatura es: " + tempMayor + ". En la ciudad de: "+ ciudades[posicionMayor]);
        }
    }
