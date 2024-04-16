package org.example;
import java.util.Scanner;

public class Main {public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in); //para ingresar un dato por teclado
    System.out.println("ingrese el precio del producto:");
    int precio = scanner.nextInt();
        System.out.println("ingrese una fabrica");
    int fabrica = scanner.nextInt();

    int total = 0;
    int envio = 0;
      switch (fabrica){
        case 1:
            envio = precio + precio * 7 / 100;
            total = envio + (envio * 25 / 100);
            System.out.println("El precio de producto es: " + total);
            break;
        case 2:
            envio = precio + precio * 15 / 100;
            total = envio + (envio * 25 / 100);
            System.out.println("El precio de producto es: " + total);
            break;
        case 3:
            envio = precio + precio * 22 / 100;
            total = envio + (envio * 25 / 100);;
            System.out.println("El precio de producto es: " + total);
            break;
        default:
            System.out.println("No existe ese tipo de fabrica");
            break;
        }
    }
}