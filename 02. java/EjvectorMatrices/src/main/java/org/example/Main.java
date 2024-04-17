package org.example;

public class Main {
    public static void main(String[] args) {

        //Declaración de arrays de Vectores
        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        int[] numeros2 = {6, 7, 8, 9, 10};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(numeros2[i]);
        }

        //Declaración de arrays de Matrices
        int identidad[][] = new int[3][3];
        identidad[0][0] = 1;
        identidad[0][1] = 0;
        identidad[0][2] = 0;
        identidad[1][0] = 0;
        identidad[1][1] = 1;
        identidad[1][2] = 0;
        identidad[2][0] = 0;
        identidad[2][1] = 0;
        identidad[2][2] = 1;

        int[][] identidad2 = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};

        for (int i = 0; i < identidad.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(identidad[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("************");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(identidad2[i][j] + " ");
            }
            System.out.println();
        }

        String[] nombres = {"Juan", "Pedro", "Maria"};
        String[] dias = new String[]{"Lunes", "Martes", "Miercoles"};
        String[][] dias2 = {{"Lunes", "Martes", "Miercoles"}, {"Jueves", "Viernes", "Sabado"}};

        System.out.println("************");

        // Crear un array de vectores (arrays)
        int[][] vectorDeVectores = new int[3][]; // Por ejemplo, un array que contenga 3 vectores

        // Inicializar cada vector dentro del vector de vectores
        vectorDeVectores[0] = new int[]{1, 2}; // Se inicializa un vector de 2 elementos
        vectorDeVectores[1] = new int[]{3, 4, 5}; // Se inicializa otro vector de 3 elementos/
        vectorDeVectores[2] = new int[]{6}; // Se inicializa otro vector de 1 elemento

        //Como vemos, no hace falta definir también el valor de la columna en la linea 63
        //

        for (int i = 0; i < vectorDeVectores.length; i++) {
            for (int j = 0; j < vectorDeVectores[i].length; j++) {
                System.out.print(vectorDeVectores[i][j] + " ");
            }
            System.out.println();
        }
    }
}