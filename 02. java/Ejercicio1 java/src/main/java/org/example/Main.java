package org.example;


import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

//        EJERCICIO 1
//        String nombre = "Julián";
//        String apellido = "Gomez";
//        int edad = 35;
//        boolean esCasado = false;
//        double sueldo = 45857.90;
//
//        System.out.println("Hola soy" + " " + nombre + " " + apellido + " tengo " + edad + " años" );

//        EJERCICIO 2
//        String nombre;
//        int edad;
//        double sueldo;
//        String apellido;
//        String direccion;
//        boolean licenciaDeConducir;
//        double estaturaDeLaPersona;
//        int cantidadDeHijos;

//        EJERCICIO 3
//        int valorDia = 2;
//
//        System.out.println("Ingrese la cantidad de dias de la campaña. Recuerde que el valor del día es $" + valorDia);
//        Scanner scanner =  new Scanner(System.in);
//        int dias = scanner.nextInt();
//
//        System.out.println("El valor total de la campaña es " + dias * valorDia);
//
//        scanner.close();

//          EJERCICIO 4

//        int premio = 23563899;
//
//        double impuestoUno = 2.45;
//        double impuestoDos = 15;
//        double impuestoTres = 3;
//
//        double impuestoTotal = (impuestoUno + impuestoDos + impuestoTres) /100;
//
//        double premioTotal = premio - (impuestoTotal * premio);
//
//        System.out.println("El valor total del premio es de $ " + String.format("$%.2f", premioTotal));
//    }


//

//            Ejercicio VECTORES/MATRICES

//        String[] ciudades = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción", "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
//
//        // Matriz de temperaturas
//        int[][] temperaturas = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};
//
//        // Encontrar la temperatura máxima y mínima y sus respectivas ciudades
//        int maxTemperatura = 0;
//        int minTemperatura = 0;
//        String ciudadMaxTemperatura = "";
//        String ciudadMinTemperatura = "";
//
//        // Recorremos el vector ciudades
//        for (int i = 0; i < ciudades.length; i++) {
//            if (temperaturas[i][1] > maxTemperatura) {
//                maxTemperatura = temperaturas[i][1];
//                ciudadMaxTemperatura = ciudades[i];
//            }
//
//            if (temperaturas[i][0] < minTemperatura) {
//                minTemperatura = temperaturas[i][0];
//                ciudadMinTemperatura = ciudades[i];
//            }
//        }
//
//        // Imprimir el resultado
//        System.out.println("La temperatura máxima registrada fue de " + maxTemperatura + " °C en " + ciudadMaxTemperatura);
//        System.out.println("La temperatura mínima registrada fue de " + minTemperatura + " °C en " + ciudadMinTemperatura);
//

        // EJERCICIO GUARDAROPA
//        // Crear el ArrayList de prendas
//        List<String[]> prendas = new ArrayList<>();
//        prendas.add(new String[]{"nike", "air max"});
//        prendas.add(new String[]{"adidas", "climacool"});
//        prendas.add(new String[]{"topper", "way"});
//
//        // Crear el HashMap para guardar las prendas
//        HashMap<Integer, Integer> guardarPrendas = new HashMap<>();
//        for (int i = 0; i < prendas.size(); i++) {
//            guardarPrendas.put(i, i);
//        }
//
//        // Recorrer el HashMap e imprimir las prendas
//        for (Integer key : guardarPrendas.keySet()) {
//            int keyPrenda = guardarPrendas.get(key);
//            String[] prenda = prendas.get(keyPrenda);
//            System.out.println("Prenda en key " + key + ": " + prenda[0] + ", " + prenda[1]);
//        }
//
//        // Buscar una prenda por marca o modelo
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Ingrese la marca o modelo de su prenda:");
//        String busqueda = scanner.next();
//
//        for (Integer key : guardarPrendas.keySet()) {
//            int keyPrenda = guardarPrendas.get(key);
//            String[] prenda = prendas.get(keyPrenda);
//            if (prenda[0].equalsIgnoreCase(busqueda) || prenda[1].equalsIgnoreCase(busqueda)) {
//                System.out.println("Se encontró la prenda: " + prenda[0] + ", " + prenda[1] + " con la key " + key);
//                // Terminar después de encontrar la primera coincidencia
//            }
//        }

    }

    }






