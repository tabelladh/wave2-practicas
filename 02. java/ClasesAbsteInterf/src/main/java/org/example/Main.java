package org.example;

public class Main {
    public static void main(String[] args) {


        /******* MANEJO DE DATOS CON WRAPPERS **************/
        Profesor profesor1 = new ProfesorTeoria( 33000111, "Andres", "Gutierrez", 30, "Programacion", "https://meet.google.com/lookup/ff3xqjxk5c");
        ProfesorPractica profesor2 = new ProfesorPractica(33000110,"Jose", "Perez", 30, "Libro Joyanes");


        System.out.println(profesor1.getEdad().compareTo(profesor2.getEdad()));

        System.out.println(profesor1.getEdad().equals(profesor2.getEdad()));

        String edadProfe = String.valueOf(profesor1.getEdad());

        System.out.println(profesor2.findId(33000110));
        System.out.println(profesor2.findId(33000111));

        System.out.println(edadProfe);



    }
}