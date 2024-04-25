package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class actividad2 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Ingrese el DNI del empleado");
        double dniEmpleado = scanner.nextDouble();

        System.out.println("Ingrese el sueldo actual del empleado");
        double sueldoActual = scanner.nextDouble();

        double  sueldoFinal = 0;

        if (sueldoActual <= 20000) {
            sueldoFinal = sueldoActual +(sueldoActual * 20 / 100);
        }
        else if (sueldoActual <= 45000) {
            sueldoFinal = sueldoActual + (sueldoActual * 10 / 100);
        }
        else {
            sueldoFinal = sueldoActual + (sueldoActual * 5 /100);
        }

        System.out.println("El nuevo sueldo del empleado es: " + sueldoFinal);

        scanner.close();
    }
}
