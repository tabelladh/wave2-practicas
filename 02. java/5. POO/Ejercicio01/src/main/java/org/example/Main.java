package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 = new Persona(123456789, "Juan", 30, 70.5, 1.75);
        //1. si utilizo get en cualquiera de los atributos de persona1 voy a obtener null para
        //String y 0 para el respo de valores.
        //2. si utilizo set sobre el objeto vacio este cargara el valor correspondiente al atributo.
        //3.Si utilizo el metodo get de un atributo con valor voy a obtener este.
        //4. si uso cualquier método set sobre un atributo del objeto que ya tiene valores se asigna el nuevo valor



    }
}