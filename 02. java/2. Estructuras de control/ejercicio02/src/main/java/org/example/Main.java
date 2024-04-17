package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
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
