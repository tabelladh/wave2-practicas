package org.example;
import java.text.DecimalFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class actividad2 {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Ingrese el monto bruto del premio");
        double montoBruto = scanner.nextDouble();
        DecimalFormat formato = new DecimalFormat("#,###");

        double impuesto1 = montoBruto * 2.45 / 100;
        double impuesto2 = montoBruto * 15 / 100;
        double impuesto3 = montoBruto * 3 /100;

        double montoNeto;
        montoNeto = montoBruto - impuesto1 -impuesto2 - impuesto3;
        String resultado = formato.format(montoNeto);

        System.out.println("El premio neto es " + resultado);
        scanner.close();
        }
    }
