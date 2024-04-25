package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class actividad1 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Ingrese el costo del producto");
        double costoProducto = scanner.nextDouble();

        System.out.println("Ingrese el numero de la fabrica");
        double numeroFabrica = scanner.nextDouble();

       double  precioConEnvio = 0;

        if (numeroFabrica == 1) {
            precioConEnvio = costoProducto * 1.07;
        }
        else if (numeroFabrica == 2) {
            precioConEnvio = costoProducto * 1.15;
        }
        else if (numeroFabrica == 3) {
            precioConEnvio = costoProducto * 1.22;
        }
        else {
            System.out.println("Número de fábrica no válido.");
        }
        double ganancia = precioConEnvio * 0.25;
        double precioFinal = precioConEnvio + ganancia;
        System.out.println("El costo del producto es $" + costoProducto);
        System.out.println("La ganancia del producto es $" + ganancia);
        System.out.println("EL precio final del producto es " + precioFinal);


        scanner.close();
        }
    }
