package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int num = scanner.nextInt();

        if (num > 5) {
            System.out.println("El numero " + num + " es mayor que 5");
        } else {
            System.out.println("El numero " + num + " es menor que 5");
        }

        System.out.println("Introduce una nota");
        int nota = scanner.nextInt();

        switch (nota) {
            case 10:
                System.out.println("Excelente");
                break;
            case 9:
                System.out.println("Muy bueno");
                break;
            case 8:
                System.out.println("Bueno");
                break;
            case 7:
                System.out.println("Regular");
                break;
            case 6:
                System.out.println("Insuficiente");
                break;
            default:
                System.out.println("No es una nota valida");
        }

        //Vamos a probar el otro switch

        System.out.println("Introduce un numero entre 1 y 4");
        num = scanner.nextInt();
        switch (num) {
            case 1 -> {
                System.out.println("Uno");
                System.out.println("Aca entro a la primera linea");
            }
            case 2 -> System.out.println("Dos");
            case 3 -> System.out.println("Tres");
            case 4 -> System.out.println("Cuatro");
            default -> System.out.println("No es un numero entre 1 y 4");
        }

        //Vamos a probar un do while

        System.out.println("Introduce un numero");
        num = scanner.nextInt();
        do {
            System.out.println(num);
            System.out.println("Vuelta numero " + num);
            num--;
        } while (num > 0);

        //Lo mismo pero con un while

        System.out.println("Introduce un numero");
        num = scanner.nextInt();
        while (num > 0) {
            System.out.println(num);
            System.out.println("Vuelta numero " + num);
            num--;
        }

        //Probemos el mismo bucle pero con for

        System.out.println("Introduce un numero");
        num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println(i + 1);
            System.out.println("Vuelta numero " + i + 1);
        }

        //Ejercicio 1 Una tienda de ropa compra sus productos de 3 fábricas distintas distribuidas por todo el país.
        // Para determinar el precio de venta de cada una de las prendas, es necesario sumar
        //un porcentaje (%) equivalente al costo de envío dependiendo de en qué haya comprado la misma.
        // Para ello, el vendedor utiliza actualmente la siguiente tabla de valores:
        //Fábrica Nº Distancia de sede principal % por costo de envío
        //1           500km                                7%
        //2           780km                                15%
        //3           1200km                               22%

        //A partir de esto, el comerciante necesita que a partir del precio de costo del producto y el número de
        // fábrica de la cual lo adquirió, obtener como resultado el precio estimado de venta teniendo en cuenta que
        // además del porcentaje de costo de envío se le suma un 25% extra que corresponde
        // a la ganancia que desea obtener.
        //Desarrollar un programa que le facilite al comerciante poder llevar a cabo esta tarea.

        //Primero, el comerciante introduce el precio de costo del proyecto
        System.out.println("Introduce el precio de costo del producto");
        double precioCosto = scanner.nextDouble();

        //Ahora, el comerciante introduce el número de fábrica de la cual lo adquirió
        System.out.println("Introduce el número de fábrica de la cual lo adquirió");
        int numDeFabrica = scanner.nextInt();

        //Estructura de control para determinar el porcentaje de envío

        double porcentajeEnvio = 0;
        switch (numDeFabrica) {
            case 1:
                porcentajeEnvio = 0.07;
                break;
            case 2:
                porcentajeEnvio = 0.15;
                break;
            case 3:
                porcentajeEnvio = 0.22;
                break;
            default:
                System.out.println("No es una fábrica");
        }

        //Ganacia es 25% simpre
        double ganancia = 0.25;

        //Se muestra el precio estimado de venta
        double precioConEnvio = (porcentajeEnvio * precioCosto) + precioCosto;
        double precioFinal = (ganancia * precioConEnvio) + precioConEnvio;

        System.out.println("El precio estimado de venta es: " + precioFinal);


        //Ejercicio Nº 2
        //Una empresa de paquetería desea realizar una actualización de los sueldos de sus empleados.
        // Para ello, desean la creación de un programa que al asignar un DNI y un monto, determine si al empleado en
        // cuestión le corresponde o no un aumento. Para ello tiene en cuenta las siguientes condiciones:
        //
        //a. Si el sueldo es menor o igual a $20.000 le corresponde un 20% de aumento.
        //b. Si el sueldo es mayor a $20.000 pero menor o igual a $45.000 le corresponde un 10% de aumento.
        //c. Si el sueldo es mayor a $45.000 le corresponde un 5% de aumento.
        //
        //Realizar un programa que determine el porcentaje de aumento de un empleado a partir del ingreso de los datos
        // mencionados anteriormente.

        System.out.println("Introduce el DNI");
        int dni = scanner.nextInt();

        System.out.println("Introduce el sueldo bruto");
        double sueldo = scanner.nextDouble();

        double porcentajeAumento = 0;

        if (sueldo > 0 && sueldo <= 20000) {
            porcentajeAumento = 0.20;
        } else if (sueldo > 20000 && sueldo <= 45000) {
            porcentajeAumento = 0.10;
        } else {
            porcentajeAumento = 0.05;
        }

        double sueldoFinal = (porcentajeAumento * sueldo) + sueldo;

        System.out.println("El porcentaje de aumento es: " + (porcentajeAumento * 100) + "% " +
                "\nEl DNI es: " + dni +
                "\nEl sueldo bruto es: " + sueldo +
                "\nLa sueldo final con aumento: " + sueldoFinal);


        //Ejercicio Nº 3
        //Una empresa de servicios de seguridad tiene 7 clientes que todos los meses abonan la cuota de dos posibles tipos de servicio:
        //
        //Servicio 1: Seguridad con cámaras : Precio Fijo de $1500 al mes
        //Servicio 2: Seguridad con cámaras + patrullaje : Precio de $1500 + $700 por el servicio de patrullaje
        //
        //Dependiendo del tipo de servicio, se desea poder calcular el monto final de la factura para cada uno de los 7 clientes e informar el monto final a abonar por pantalla para cada uno de los mismos.
        //
        //
        //Cliente 1: Servicio 1
        //Cliente 2: Servicio 2
        //Cliente 3: Servicio 2
        //Cliente 4: Servicio 2
        //Cliente 5: Servicio 1
        //Cliente 6: Servicio 1
        //Cliente 7: Servicio 1

        int servicioUno = 1500;
        int servicioDos = 1500 + 700;

        for (int i = 1; i <= 7; i++) {
            System.out.println("Cliente " + i + " elija servicio 1 o 2" +
                    "\n1. Servicio 1: Seguridad con cámaras : Precio Fijo de $1500 al mes" +
                    "\n2. Servicio 2: Seguridad con máquinas + patrullaje : Precio de $1500 + $700 por el servicio de patrullaje");
            int servicioElegido = scanner.nextInt();

            if (servicioElegido == 1) {
                System.out.println("Cliente numero " + i + " El monto final es: $" + servicioUno);
            } else if (servicioElegido == 2) {
                System.out.println("Cliente numero " + i + " El monto final es: $" + servicioDos);
            } else {
                System.out.println("No es un servicio");
                i--;
            }
        }


        //Ejercicio Nº 4
        //Una encuestadora llevó a cabo una encuesta a 50 personas para conocer cuántas de ellas tienen suscripciones a diarios digitales. Para ello, seleccionó 3 Diarios Digitales: Diario A, Diario B y Diario C.
        //Al mismo tiempo, la encuestadora desea un programa que a partir del ingreso por teclado de los datos ya recolectados, permita determinar los siguientes datos estadísticos de estas 50 personas:
        //
        //¿Cuántos están suscriptos a los 3 diarios?
        //¿Cuántos están suscriptos al Diario A y al Diario C?
        //¿Cuántos están suscriptos al Diario A y al Diario B?
        //¿Cuántos están suscriptos al Diario B y al Diario C?
        //¿Cuántos están suscriptos sólo al Diario A?
        int totalDiarioA = 0;
        int totalDiarioB = 0;
        int totalDiarioC = 0;

        for (int i = 1; i <= 50; i++) {
            System.out.println("Usuario " + i + " a cuantos diarios digitales estas suscripto?");
            int diariosDigitales = scanner.nextInt();

            if (diariosDigitales == 1) {
                totalDiarioA++;
            } else if (diariosDigitales == 2) {
                totalDiarioB++;
            } else if (diariosDigitales == 3) {
                totalDiarioC++;
            } else {
                System.out.println("Debes elegir uno o mas de un diario, vuelve a intentarlo");
                i--;
            }

        }

        System.out.println("El total de suscriptores a los 3 diarios digitales es: " + (totalDiarioA + totalDiarioB + totalDiarioC)
                + "\nEl total de suscriptores al diario A y C es: " + (totalDiarioA + totalDiarioC)
                + "\nEl total de suscriptores al diario A y B es: " + (totalDiarioA + totalDiarioB)
                + "\nEl total de suscriptores al diario B y C es: " + (totalDiarioB + totalDiarioC)
                + "\nEl total de suscriptores solo al diario A es: " + totalDiarioA);
    }
}