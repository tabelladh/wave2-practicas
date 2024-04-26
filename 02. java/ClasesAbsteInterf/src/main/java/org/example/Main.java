package org.example;

public class Main {
    public static void main(String[] args) {


        /******* MANEJO DE DATOS CON WRAPPERS **************/
        Profesor profesor = new ProfesorTeoria( 33000111, "Andres", "Gutierrez", 30, "Programacion", "https://meet.google.com/lookup/ff3xqjxk5c");
        ProfesorPractica profesor2 = new ProfesorPractica(33000110,"Jose", "Perez", 30, "Libro Joyanes");

        System.out.println(profesor.getEdad().compareTo(profesor2.getEdad()));

        System.out.println(profesor.getEdad().equals(profesor2.getEdad()));

        String edadProfe = String.valueOf(profesor.getEdad());

        System.out.println(profesor2.findId(33000110));

        System.out.println(edadProfe);



    }
}