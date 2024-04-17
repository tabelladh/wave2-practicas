package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*Ejercicio Nº 1
        Un estudiante de programación intentó realizar declaraciones de variables con sus respectivos tipos
        en Java pero tuvo varias dudas mientras lo hacía. A partir de esto, nos brindó su código y pidió la
         ayuda de un desarrollador experimentado que pudiera darle una mano. ¿Podrías copiar su código en
         algún IDE y verificar si es necesario realizar correcciones? */

        /*String apellido = "Gomez";
        int edad = 35;
        boolean esEstudiante = false;
        double sueldo = 45857.90;
        String nombre = "Julián";*/


        /*Ejercicio Nº 2
        Un profesor de programación está corrigiendo los exámenes de sus estudiantes de la materia Programación
        I para poder brindarles las correspondientes devoluciones. Uno de los puntos del examen consistía
        en proponer nombres de variables, pero uno de los alumnos propuso nombres bastante peculiares.
        ¿Podrías ayudar al profesor a detectar cuáles de estos nombres que utilizó el alumno no son nombres
        de variables correctos?  Para ello, copiá la porción de código en tu IDE y validá los posibles errores.*/

        // Nombres de variables válidos:
        /*int edad;
        double sueldo;
        String apellido;
        String direccion;
        boolean licenciaDeConducir;
        int cantidadDeHijos;

        System.out.printf("Hello and welcome!");*/

        /*Ejercicio Nº 3
        Un Community Manager desea llevar a cabo una campaña publicitaria para uno de sus clientes en Instagram. Para ello, necesita una aplicación que sea capaz de calcular el costo total de la campaña a partir de la otorgación de la cantidad de días que dura la misma.
                El precio por día de campaña es de $2 dólares (fijos). Realizar un programa que a partir del ingreso de la cantidad de días, devuelva por pantalla el monto total.
                Por ejemplo:
        Si se ingresa 5 días de campaña → $2 * 5 = $10
        Si se ingresa 8 días de campaña → $2 * 8 = $16*/

        /*int valor_dia = 2;

        System.out.println("Ingresa la cantidad de días de la campaña, recuerda que el valor por día es de $" + valor_dia);
        Scanner scanner =  new Scanner(System.in);
        int dias = scanner.nextInt();

        System.out.println("El valor total de la campaña es de $" + (dias * valor_dia));
        scanner.close();*/

        /*Ejercicio Nº 4
        Un habitante de un pequeño pueblo se enteró por los medios de comunicación que es el ganador de la lotería
         de su país. El premio total es de $23.563.899, sin embargo, a este monto se le debe aplicar una serie de
          impuestos para poder otorgar el premio final. Entre estos descuentos por impuestos se encuentran:

        Impuesto 1 → 2,45% sobre el valor total
        Impuesto 2 → 15% sobre el valor total
        Impuesto 3 → 3% sobre el valor total
        Realizar un programa que le permita a cualquier ciudadano la posibilidad de ingresar el monto en bruto del premio y calcular a partir de él, el monto total neto que le corresponde como premio luego de aplicar los descuentos de los 3 impuestos.
                Tener en cuenta que todos los porcentajes de descuento se calculan SOBRE EL VALOR TOTAL.*/

        /*double montoBruto = 23563899.0; // Monto bruto del premio

        // Calcular impuestos
        double impuesto1 = montoBruto * 0.0245; // 2.45% de impuesto
        double impuesto2 = montoBruto * 0.15;   // 15% de impuesto
        double impuesto3 = montoBruto * 0.03;   // 3% de impuesto

        // Calcular monto neto después de aplicar impuestos
        double montoNeto = montoBruto - (impuesto1 + impuesto2 + impuesto3);

        System.out.println("El monto total neto del premio luego de aplicar los impuestos es: $" + montoNeto);*/

        
    }
}