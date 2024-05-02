/*
Se desea un programa que maneje 2 servicios de una peluquería: lavado y corte.
Pero, se tiene la particularidad de que la id para cada uno de estos servicios se maneja de forma diferente
(Uno con números enteros y otro con cadenas de caracteres), por ello, se decidió utilizar una clase genérica.
Se necesita:
Crear una clase Generic: ServicioGenerico que contenga en el operador diamante la letra <E>.
Sus atributos serán: id de tipo genérico E, y un String nombre (Que indica el nombre del servicio).
Crear la clase Lavado con el atributo “observacion” y la clase Corte con el atributo “tipo”.
Ambas clases, Lavado y Corte, heredan de ServicioGenerico, con la particularidad que al heredar, se debe especificar
en el operador diamante el tipo <Integer> para Lavado y el tipo  <String> para corte, ya que como se mencionó
anteriormente, la id para cada una de estas clases se manejara con tipos de dato diferentes.
Crear una instancia de cada clase en el Main, cargar un lavado y un corte. Verificar que al momento de pasar los
parámetros, el compilador nos indique que para Lavado se deba pasar un entero para la id, mientras que para el
Corte se deba pasar una cadena. Mostrar por pantalla los datos cargados.
*/

package org.example.lambdaGenericWrapperStreams.peluqueria;

public class Main {
    public static void main(String[] args) {
        Lavado lavado = new Lavado(1, "Lavado de Cabello", "Con crema");
        Corte corte = new Corte("corte1", "Corte de Cabello", "Rapado");

        // Mostrar datos cargados
        System.out.println("Lavado:");
        System.out.println("ID: " + lavado.getId());
        System.out.println("Nombre: " + lavado.getNombre());
        System.out.println("Observación: " + lavado.getObservacion());
        System.out.println();

        System.out.println("Corte:");
        System.out.println("ID: " + corte.getId());
        System.out.println("Nombre: " + corte.getNombre());
        System.out.println("Tipo: " + corte.getTipo());
    }
}
