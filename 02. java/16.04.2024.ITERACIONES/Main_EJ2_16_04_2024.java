package 16.04.2024.ITERACIONES;

import java.util.Scanner;

public class Main_EJ2_16_04_2024 {
    public static void main(String[] args) {

        int DNI=0;
        double monto=0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el DNI del empleado: ");
        DNI=sc.nextInt();

        System.out.print("Ingrese el sueldo del empleado: ");
        monto=sc.nextDouble();
        sc.close();

        if (monto <= 20000) {
            System.out.println("El porcentaje de aumento es 20%. El total es: " + monto * 1.2);
        }
        if (monto > 20000 && monto <= 45000) {
            System.out.println("El porcentaje de aumento es 10%. El total es: " + monto * 1.1);
        }
        if (monto > 45000) {
            System.out.println("El porcentaje de aumento es 5%. El total es: " + monto * 1.05);
        }

    }
}