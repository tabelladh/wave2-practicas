package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /** LIST : Permite elementos duplicados. LISTA ORDENADA **/
        //ARRAYLIST
        System.out.println("ArrayList");
        List<Integer> listaInt = new ArrayList<>();
        //ArrayList<Integer> listaInt = new ArrayList<>();
        // esta declaración funciona como la de arriba,
        // solo que se declara al inicio el tipo de estructura de List que vamos a utilizar.


        //Agrego elementos a la lista
        listaInt.add(10);
        listaInt.add(20);
        listaInt.add(30);

        //Recorro la lista
        for (Integer i : listaInt) {
            System.out.println(i);
        }

        //Elimino un elemento de la lista
        listaInt.remove(listaInt.get(2));
        listaInt.removeFirst();

        System.out.println("Lista después de eliminar: " + listaInt);
        System.out.println("Y ahora tiene esta cantidad de elementos: " +listaInt.size());

        ///LINKEDLIST

        LinkedList<String> listaEnlazada = new LinkedList<>();

        //Agrego elementos a la lista
        listaEnlazada.add("Manzana");
        listaEnlazada.add("Banana");
        listaEnlazada.add("Pera");

        //Recorro la lista
        System.out.println("\nAhora con LinkedList\nLista inicial" + listaEnlazada);
        for (String i : listaEnlazada) {
            System.out.println(i);
        }

        //Elimino un elemento de la lista
        listaEnlazada.remove("Banana");

        System.out.println("Lista actualizada" + listaEnlazada);

        //Elimino el primer elemento de la lista
        String elementoEliminado = listaEnlazada.removeFirst();
        System.out.println(elementoEliminado);

        /** SET : No permite elementos duplicados. LISTA NO ORDENADA **/

        Set<String> nombres = new HashSet<>();

        //Agrego elementos a la lista
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Luis");

        //Recorro la lista
        System.out.println("\nSET con HashSet\nNombres: " + nombres);

        // Comprobar si el conjunto contiene un elemento específico
        System.out.println("¿El conjunto contiene 'Juan'?: " + nombres.contains("Juan"));

        // Eliminar un elemento del conjunto
        nombres.remove("Luis");
        System.out.println("Conjunto después de eliminar 'Luis': " + nombres);

        /** MAP : CLAVE VALOR **/

        //HashMap
        HashMap<String, String> traductor = new HashMap<>();

        //Agrego elementos a la lista
        traductor.put("Hello", "Hola");
        traductor.put("Goodbye", "Adios");
        traductor.put("Pencil", "Lápiz");
        traductor.put("Book", "Libro");

        //Recorro la lista por clave-valor

        for (Map.Entry<String, String> entry : traductor.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        //Con esto tambien se puede recorrer la lista
        for(Map.Entry<String, String> entrada2 : traductor.entrySet()){
            String clave = entrada2.getKey();
            String valor = entrada2.getValue();
            System.out.println(clave + " = " + valor);

        }

        //iterar sobre clave o valor
        for (String ingles : traductor.keySet()) {
            System.out.println("Inglés: " + ingles);
        }

        for (String espaniol : traductor.values()) {
            System.out.println("Español: " + espaniol);
        }

        //Agregar elementos a la lista
        traductor.put("Apple", "Manzana");

        String valor = traductor.get("Hello");
        System.out.println("El valor de 'Hello' es: " + valor);
        traductor.remove("Book");


    }
}