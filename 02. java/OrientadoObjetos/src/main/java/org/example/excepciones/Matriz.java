/*
Se desea un programa que sea capaz de almacenar en una matriz de 4 x 3 (4 filas y 3 columnas)
diferentes números enteros. Para esto se solicita al usuario que ingrese dichos números por teclado.
Cada fila de la matriz, corresponde a una operación matemática de la siguiente manera:
Fila 0: Suma Fila 1: Resta Fila 2: Multiplicación Fila 3: División.
El programa debe ser capaz de recorrer las 3 columnas de cada fila y hacer, entre los números allí
cargados, la operación que corresponde a cada una y guardar el resultado en un vector.
Por ejemplo, si en la fila 2 tenemos un 35, un 23 y un 91, debemos hacer 35*23*91.
Cada posición del vector de resultados debe corresponder con la fila de la matriz.
Por ejemplo, fila 0 de la matriz es la posición 0 del vector.
A partir de esto, el programa debe permitir al usuario ingresar por teclado un tipo de operación
(del 0 al 3). Entonces, el programa hace el procedimiento mencionado anteriormente y se le
debe mostrar al usuario el resultado almacenado en el vector para la operación que haya seleccionado.
Realizar el programa teniendo en cuenta que el usuario accidentalmente puede proporcionar posiciones
que NO EXISTAN EN EL VECTOR o la MATRIZ (Por ejemplo posición 4). Tratar esta posibilidad mediante excepciones.
Pistas técnicas: El tipo de excepción que puede ser usada es: IndexOutOfBoundsException
*/

package org.example.excepciones;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        int[][] matriz = new int[4][3];
        int[] resultados = new int[4];
        boolean[] operacionRealizada = new boolean[4]; // Para verificar si se ha realizado una operación en esa posición

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese el número para la fila " + i + " y la columna " + j + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Mostrar la matriz ingresada por el usuario
        System.out.println("\nMatriz ingresada:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Realizar las operaciones y guardar los resultados en el vector
        while (true) {
            // Pedir al usuario que ingrese el tipo de operación
            System.out.print("\nIngrese el tipo de operación (0: Suma, 1: Resta, 2: Multiplicación, 3: División, -1: Salir): ");
            int tipoOperacion = scanner.nextInt();

            if (tipoOperacion == -1) {
                break; // Salir del bucle si el usuario ingresa -1
            }

            // Verificar si el tipo de operación ingresado es válido
            if (tipoOperacion < 0 || tipoOperacion >= resultados.length) {
                System.out.println("Error: El tipo de operación ingresado no es válido.");
                continue; // Volver a pedir al usuario que ingrese una operación válida
            }

            // Verificar si la operación ya se realizó en esa posición
            if (operacionRealizada[tipoOperacion]) {
                System.out.println("Error: Ya se ha realizado una operación en esta posición del vector.");
                continue; // Volver a pedir al usuario que ingrese una operación válida
            }
            try {
                resultados[tipoOperacion] = realizarOperacion(tipoOperacion, matriz);
                operacionRealizada[tipoOperacion] = true; // Marcar la operación como realizada
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Error: La posición ingresada no existe en el vector o la matriz.");
            }
        }

        // Mostrar los resultados
        System.out.println("\nResultados de las operaciones:");
        for (int i = 0; i < 4; i++) {
            if (operacionRealizada[i]) {
                System.out.println("Operación " + i + ": " + resultados[i]);
            } else {
                System.out.println("Operación " + i + ": No se ha realizado.");
            }
        }
        scanner.close();
    }

    // Método para realizar la operación correspondiente a cada fila de la matriz
    public static int realizarOperacion(int tipoOperacion, int[][] matriz) {
        int resultado = 0;

        switch (tipoOperacion) {
            case 0: // Suma
                for (int num : matriz[0]) {
                    resultado += num;
                }
                break;
            case 1: // Resta
                resultado = matriz[1][0];
                for (int i = 1; i < matriz[1].length; i++) {
                    resultado -= matriz[1][i];
                }
                break;
            case 2: // Multiplicación
                resultado = 1;
                for (int num : matriz[2]) {
                    resultado *= num;
                }
                break;
            case 3: // División
                resultado = matriz[3][0];
                for (int i = 1; i < matriz[3].length; i++) {
                    resultado /= matriz[3][i];
                }
                break;
            default:
                throw new IndexOutOfBoundsException();
        }
        return resultado;
    }
}