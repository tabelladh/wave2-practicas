package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.print("Ingrese el monto del premio: ");
        Scanner scanner = new Scanner(System.in);
        double premio = scanner.nextDouble();

        double im1 = premio * 0.0245;
        double im2 = premio * 0.15;
        double im3 = premio * 0.03;

        System.out.println("El total del premio es: $" + (premio - (im1 + im2 + im3)));
    }
}