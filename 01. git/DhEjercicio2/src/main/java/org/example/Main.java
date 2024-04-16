package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ingresa un numero");
//        int number = scanner.nextInt();
//        System.out.println("Ingresa un nombre");
//        String name = scanner.next();
//        System.out.println("Ingresa un decimal utilizando , como separador");
//        double decimal = scanner.nextDouble();
//
//        System.out.println("Tu numero es: " + number + "\nTu nombre es: " + name + "\nTu decimal es: " + decimal);
        // Ejercicio 1
//        String apellido = Gomez;
//        int edad = "35";
//        boolean = "false";
//        String sueldo = 45857.90
//        double nombre = "Julián";

        //Correciones

//        String apellido = Gomez;
//        int edad = 35;
//        boolean variable = false;
//        double sueldo = 45857.90;
//        String nombre = "Julián";


        // Ejercicio 2
//        String nombre;
//        int edad;
//        double $ueldo;
//        String @pellido;
//        String direccion;
//        boolean licencia_de_conducir;
//        double estatura de la persona;
//        int cantidad-de-hijos;

        // Correciones

//        String nombre;
//        int edad;
//        double sueldo;
//        String apellido;
//        String direccion;
//        boolean licencia_de_conducir;
//        double estatura_de_la_persona;
//        int cantidad_de_hijos;

//         Ejercicio 3
//        Un Community Manager desea llevar a cabo una campaña publicitaria para uno de sus clientes en Instagram.
//         Para ello, necesita una aplicación que sea capaz de calcular el costo total de la campaña a partir de la
//         otorgación de la cantidad de días que dura la misma.
//        El precio por día de campaña es de $2 dólares (fijos). Realizar un programa que a partir del ingreso de la
//         cantidad de días, devuelva por pantalla el monto total.
//        Por ejemplo:
//        Si se ingresa 5 días de campaña → $2 * 5 = $10
//        Si se ingresa 8 días de campaña → $2 * 8 = $16

        //Correciones
//        int valor_dia = 2;
//
//        System.out.println("Ingresa la cantidad de dias de la campaña, " +
//                "recuerda que el valor por dia es de $" + valor_dia);
//        int dias = scanner.nextInt();
//
//        System.out.println("El valor total de la campaña es $" + (dias * valor_dia));

        //Ejercicio Nº 4
        //Un habitante de un pequeño pueblo se enteró por los medios de comunicación que es el ganador de la lotería
        // de su país. El premio total es de $23.563.899, sin embargo, a este monto se le debe aplicar una serie de
        // impuestos para poder otorgar el premio final. Entre estos descuentos por impuestos se encuentran:
        //Impuesto 1 → 2,45% sobre el valor total
        //Impuesto 2 → 15% sobre el valor total
        //Impuesto 3 → 3% sobre el valor total
        //Realizar un programa que le permita a cualquier ciudadano la posibilidad de ingresar el monto en bruto del
        // premio y calcular a partir de él, el monto total neto que le corresponde como premio luego de aplicar los
        // descuentos de los 3 impuestos.
        //Tener en cuenta que todos los porcentajes de descuento se calculan SOBRE EL VALOR TOTAL.

        //Correciones
        double premio = 23563.899;

        double impuestoUno = 2.45/100;
        double impuestoDos = 15.0/100;
        double impuestoTres = 3.0/100;

        double impuestos = impuestoUno + impuestoDos + impuestoTres;

        System.out.println(
                "El porcentaje de impuestos es de: " + impuestos
                        + "\nEl valor total es de: " + premio
                        + "\nEl valor neto es de: " + String.format("$%.2f", premio - (premio * impuestos))
        );
        scanner.close();
    }
}