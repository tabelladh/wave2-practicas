package org.example;
import java.util.Scanner;

public class actividad1 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Ingrese la cantidad de dias de campaña");
        int dias = scanner.nextInt();
        double costoPorDia = 2.0;
        double costoTotal = dias * costoPorDia;
        System.out.println("El costo de la campaña es $" + costoTotal);
        scanner.close();
    }
}
