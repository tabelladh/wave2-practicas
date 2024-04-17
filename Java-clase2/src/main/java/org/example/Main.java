package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /*Estructuras de Control
// Práctica integradora
Objetivo
El objetivo de este ejercicio es que podamos afianzar y profundizar los conceptos de
 estructuras repetitivas y selectivas en Java.


Ejercicio Nº 1
Una tienda de ropa compra sus productos de 3 fábricas distintas distribuidas por todo el país. Para determinar el
precio de venta de cada una de las prendas, es necesario sumar un porcentaje (%) equivalente al costo de envío
dependiendo de en qué haya comprado la misma. Para ello, el vendedor utiliza actualmente la siguiente tabla de
valores:

Fábrica Nº        Distancia de sede principal           % por costo de envío
   1                       500km                               7%
   2                       780km                               15%
   3                       1200km                              22%

A partir de esto, el comerciante necesita que a partir del precio de costo del producto y el número de fábrica de
 la cual lo adquirió, obtener como resultado el precio estimado de venta teniendo en cuenta que además del
 porcentaje de costo de envío se le suma un 25% extra que corresponde a la ganancia que desea obtener.
Desarrollar un programa que le facilite al comerciante poder llevar a cabo esta tarea.


Ejemplo

   Buzo de algodón
Precio de costo                  $800                -
Fábrica Nº                       2                   -
% de envío                       15% → $120          $800 * 15% = $120
                                                     $800 + $120 = $920
% de ganancia                    25% → $230          $920 * 25% = $230
                                                     $920 + $230 = $1150
Precio de venta                  $1.150*/


       /*System.out.println("Ingrese el precio del producto");
        Scanner scanner =  new Scanner(System.in);
        double precio_fabrica = scanner.nextFloat();

        System.out.println("Ingrese el número de fábrica");
        int fabrica = scanner.nextInt();
        double precio_final;
        switch (fabrica)
        {
            case 1: precio_final = precio_fabrica * 1.07 * 1.25;
                System.out.println("El precio final del producto es: $" + precio_final);
                break;
            case 2: precio_final = precio_fabrica * 1.15 * 1.25;
                System.out.println("El precio final del producto es: $" + precio_final);
                break;
            case 3:  precio_final = precio_fabrica * 1.22 * 1.25;
                System.out.println("El precio final del producto es: $" + precio_final);
                break;
            default:
                System.out.println("La fábrica ingresada no es una opción válida");

        }

                scanner.close();*/


/*Ejercicio Nº 2
Una empresa de paquetería desea realizar una actualización de los sueldos de sus empleados. Para ello, desean la
 creación de un programa que al asignar un DNI y un monto, determine si al empleado en cuestión le corresponde o
 no un aumento. Para ello tiene en cuenta las siguientes condiciones:

a. Si el sueldo es menor o igual a $20.000 le corresponde un 20% de aumento.
b. Si el sueldo es mayor a $20.000 pero menor o igual a $45.000 le corresponde un 10% de aumento.
c. Si el sueldo es mayor a $45.000 le corresponde un 5% de aumento.

Realizar un programa que determine el porcentaje de aumento de un empleado a partir del ingreso de los datos
mencionados anteriormente.*/

      /*System.out.println("Ingrese el dni del empleado");
        Scanner scanner =  new Scanner(System.in);
        int dni = scanner.nextInt();

        System.out.println("Ingrese el salario del empleado");
        int salario = scanner.nextInt();
        int aumento;

        if (salario <=20000) {
            aumento = 20;
            System.out.println("Al empleado de dni: " + dni + "le corresponde un aumento del " + aumento + "%");            
        } else if (salario <= 45000) {
            aumento = 10;
            System.out.println("Al empleado de dni: " + dni + "le corresponde un aumento del " + aumento + "%");
        } else {
            aumento = 5;
            System.out.println("Al empleado de dni: " + dni + "le corresponde un aumento del " + aumento + "%");
        }
        scanner.close();*/



/*Ejercicio Nº 3

Una empresa de servicios de seguridad tiene 7 clientes que todos los meses abonan la cuota de dos posibles tipos
 de servicio:

             Servicio 1: Seguridad con cámaras : Precio Fijo de $1500 al mes
             Servicio 2: Seguridad con cámaras + patrullaje : Precio de $1500 + $700 por el servicio de
             patrullaje

Dependiendo del tipo de servicio, se desea poder calcular el monto final de la factura para cada uno de los
 7 clientes e informar el monto final a abonar por pantalla para cada uno de los mismos.

Cliente 1: Servicio 1
Cliente 2: Servicio 2
Cliente 3: Servicio 2
Cliente 4: Servicio 2
Cliente 5: Servicio 1
Cliente 6: Servicio 1
Cliente 7: Servicio 1*/


      /* System.out.println("Indique el tipo de servicio que tiene el cliente: 1 o 2");
        Scanner scanner =  new Scanner(System.in);
        int tipo_de_serv = scanner.nextInt();

        int basico = 1500;
        int bas_patrullaje = 700;
        int precioTotal;

        if (tipo_de_serv == 1) {
            precioTotal = basico;
            System.out.println("Su factura es de $" + precioTotal);
        } else if (tipo_de_serv == 2) {
            precioTotal = basico + bas_patrullaje;
            System.out.println("Su factura es de $" + precioTotal);
        } else {
            System.out.println("Tipo de servicio inválido.");
        }
        scanner.close();*/



        /*Ejercicio Nº 4
Una encuestadora llevó a cabo una encuesta a 50 personas para conocer cuántas de ellas tienen suscripciones a
diarios digitales. Para ello, seleccionó 3 Diarios Digitales: Diario A, Diario B y Diario C.
Al mismo tiempo, la encuestadora desea un programa que a partir del ingreso por teclado de los datos ya
recolectados, permita determinar los siguientes datos estadísticos de estas 50 personas:

¿Cuántos están suscriptos a los 3 diarios?
¿Cuántos están suscriptos al Diario A y al Diario C?
¿Cuántos están suscriptos al Diario A y al Diario B?
¿Cuántos están suscriptos al Diario B y al Diario C?
¿Cuántos están suscriptos sólo al Diario A?*/

      /*  Scanner scanner = new Scanner(System.in);

        // Definir contadores para cada situación
        int totalDiarioA = 0;
        int totalDiarioB = 0;
        int totalDiarioC = 0;

        for (int i = 1; i <= 50; i++) {
            System.out.println("Usuario " + i + " a cuántos diarios digitales estás suscripto?");
            int diariosDigitales = scanner.nextInt();

            if (diariosDigitales == 1) {
                totalDiarioA++;
            } else if (diariosDigitales == 2) {
                totalDiarioB++;
            } else if (diariosDigitales == 3) {
                totalDiarioC++;
            } else {
                System.out.println("Debes elegir uno o más diarios. Vuelve a intentarlo.");
                i--;
            }

        }

        System.out.println("El total de suscriptores a los 3 diarios es: " + (totalDiarioA + totalDiarioB + totalDiarioC)
                        +"\nEl total de suscriptores al diario A y C es: " + (totalDiarioA + totalDiarioC)
                        +"\nEl total de suscriptores al diario A y B es: " + (totalDiarioA + totalDiarioB)
                        +"\nEl total de suscriptores al diario B y C es: " + (totalDiarioB + totalDiarioC)
                        +"\nEl total de suscriptores solo al diario es: " + totalDiarioA);

        scanner.close();*/

    }
}