package org.example;

import org.example.model.obtenerPremio;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Establecer el locale para utilizar el punto como separador decimal
        Locale.setDefault(Locale.US);


        Scanner scanner =  new Scanner(System.in);

        System.out.println("Ingrese el valor del premio");

        double premio = scanner.nextDouble();

        obtenerPremio obtenerPremio = new obtenerPremio();

        DecimalFormat formatoDecimal = new DecimalFormat("#,###.00");

        System.out.println("El premio obtenido despues de los impuestos \n" + formatoDecimal.format(obtenerPremio.calcularPremio(premio)));
        /** La notación científica representa números grandes o pequeños como un número base multiplicado por 10 elevado a una potencia.
         * Por ejemplo, 2.3563899E7 significa 2.3563899×1072.3563899×107, lo que es igual a 23,563,89923,563,899.         **/

        System.out.println("premio sin descuentos: " + premio);
        System.out.println("Descuentos: " + (premio - obtenerPremio.calcularPremio(premio)));


        scanner.close();
    }
}