package org.example;

public class Main {
    public static void main(String[] args) {

        int a = 1000;
        int b = 1000;

        if (a==b) {
            System.out.println("a y b son iguales");
        }else    {
            System.out.println("a y b no son iguales");
        }

        Integer c = 1000;
        Integer d = 1000;

        if (c==d) {
            System.out.println("c y d son iguales");
        }else    {
            System.out.println("c y d no son iguales ");
        }

        Integer e = 100; //(rango para entrar en el stack : -128 a 127 )
        Integer f = 100;

        if (e==f) {
            System.out.println("e y f son iguales");
        }else    {
            System.out.println("e y f no son iguales");
        }

        Integer g = new Integer(100);
        Integer h = new Integer(100);

        if (g==h) { // Cambiar por Equals : g.equals(h) y verás que la respuesta cambia, ¿Porqué? :O
            System.out.println("g y h son iguales");
        }else    {
            System.out.println("g y h no son iguales");
        }

        // Ahora con Strings... veamos su comportamiento en el stack

        /** ¿Cuál será el comportamiento? ...
         * Esto pasa porque las dos cadenas de caracteres tienen el mismo contenido,
         * entonces se alojan en el Heap, en la misma posición de memoría. Funciona como el Integer.cache pero para texto.**/

        String i = "Hola mundo";
        String j = "Hola mundo";

        if(i==j) {
            System.out.println("i y j son iguales");
        }else    {
            System.out.println("i y j no son iguales");
        }

        /** A continuación vamos a forzar la creación de dos nuevos objetos con el new  ,
         *  por lo tanto si o si tienen posiciones diferentes de memoría,
         *  y usar == no es el modo correcto para comparar contenido, solo compara por "valor"
         *  */
        String k = new String("Hola mundo");
        String l = new String("Hola mundo");

        if(k==l) {
            System.out.println("k y l son iguales");
        }else    {
            System.out.println("k y l no son iguales, sus posiciones de memoria son diferentes "+ k.toString()+ " y " + l.toString());

        }

        /** Es por eso que nos da que k y l no son iguales, para comparar dos objetos por contenido entonces debemos usar Equals **/

        if(k.equals(l)) {
            System.out.println("Ahora sí el contenido de k y l son iguales");
        }

    }
}