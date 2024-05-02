/*
Realizar un programa para un juego de adivinanza de números. Para ello, el
programa debe seleccionar un número en el rango de 1 a 500 al azar (se puede usar una
función random). A partir de esta selección aleatoria:
El usuario deberá especificar números por teclado y el programa determinará si acertó o no el número correcto.
En caso de que no acierte, el programa como pista deberá decirle al usuario
si el número ingresado es menor o mayor al número a adivinar y proponerle que
ingrese uno nuevo. Al mismo tiempo, el programa debe ir contando y mostrando por
pantalla la cantidad de intentos que lleve el jugador.
En caso de adivinar, debe aparecer un mensaje por pantalla informando esto y la
cantidad de intentos que le tomó.
Contemplar para este ejercicio, mediante excepciones, la posibilidad de que:
El usuario ingrese un número fuera de rango (menor a 1 o mayor a 500).
El usuario ingrese un valor con tipo de dato diferente a entero (una letra, un número con coma, etc)
Pistas técnicas:
Para calcular un número random utilizar la clase Math (Math.random() * 500).
Para las excepciones tener en cuenta como posibles: InputMismatchException y la
creación de excepciones personalizadas.
*/

package org.example.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdivinarNum {
    public static void main(String[] args) {
        int numeroAdivinar = (int) (Math.random() * 500) + 1;
        int intentos = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al juego de adivinanza de números!");
        System.out.println(numeroAdivinar);

        while (true) {
            System.out.print("Ingresa un número entre 1 y 500: ");
            try {
                int numeroIngresado = scanner.nextInt();
                intentos++;
                if (numeroIngresado < 1 || numeroIngresado > 500) {
                    throw new NumeroFueraDeRangoException("El número ingresado está fuera del rango permitido.");
                }
                if (numeroIngresado == numeroAdivinar) {
                    System.out.println("¡Felicidades! Has adivinado el número " + numeroAdivinar + " en " + intentos + " intentos.");
                    break;
                } else if (numeroIngresado < numeroAdivinar) {
                    System.out.println("El número ingresado es menor. Intenta con un número más grande.");
                } else {
                    System.out.println("El número ingresado es mayor. Intenta con un número más pequeño.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número entero.");
                scanner.next();
            } catch (NumeroFueraDeRangoException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        scanner.close();
    }
}
// Excepción personalizada para números fuera de rango
class NumeroFueraDeRangoException extends Exception {
    public NumeroFueraDeRangoException() {
    }
    public NumeroFueraDeRangoException(String message) {
        super(message);
    }
}