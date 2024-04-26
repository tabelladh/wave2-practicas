package org.example;

public class Main {
    public static void main(String[] args) {

        Persona personaVacia = new Persona();

        Persona personaConDatos = new Persona(41287959, "Josefina", 25, 1.68, 63.0);
        System.out.println("nombre:"+ personaVacia.getNombre());
        System.out.println("Nombre:" + personaConDatos.getNombre());
    }
}
//Respuestas ejercicio 1 POO
/* 1- Obtendré un Null al querer acceder a personaVacia
2- Obtendré un method setNombre in class org.example.Persona cannot be applied to given types
3- Obtendré el valor correspondiente al campo
4- Se modificará según el nuevo valor que se le asigne
 */