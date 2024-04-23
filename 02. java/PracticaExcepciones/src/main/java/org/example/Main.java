package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        Materia materia1 = new Materia("Matematicas", 1);
        Materia materia2 = new Materia("Fisica", 2);

        List<Materia> listaMaterias1 = new ArrayList<>();
        listaMaterias1.add(materia1);
        listaMaterias1.add(materia2);

        Estudiante estudiante1 = new Estudiante("Jose", "Perez", 1, listaMaterias1);
        Estudiante estudiante2 = new Estudiante("Maria", "Gonzalez", 2, listaMaterias1);

        List<Estudiante> listaEstudiantes = new ArrayList<>();
        listaEstudiantes.add(estudiante1);
        listaEstudiantes.add(estudiante2);

        System.out.println(listaEstudiantes);

        Scanner sc = new Scanner(System.in); // Creo un nuevo objeto scanner
        System.out.println("Introduce el DNI del estudiante: ");


        int consultaDNI = 0;

        try { //Creo el código que necesito ejecutar para que funcione ok - camino feliz
            consultaDNI = sc.nextInt();  // El scanner debe estar dentro del try para controlar la excepcion de InputMismatchException
        } catch (InputMismatchException e){ // catch para Tipo de dato distinto a el scanner
            System.out.println("¡Ingresaste un valor que no era un número entero!");
            //e.printStackTrace();
            sc = new Scanner(System.in); //reseteamos el scanner
        }

        Estudiante est = new Estudiante(); // Creo un nuevo objeto estudiante para guardar informacion

        try {
            System.out.println(est.existeEstudiante(listaEstudiantes, consultaDNI));
        }  catch (NotFoundException e) {
            System.out.println(e.getMessage());
           //e.printStackTrace();
        }

        ////////// otro problema
        System.out.println("Ingrese un numero para realizar la division");


        double numero = sc.nextDouble();

        try{
            double division = 100/numero;
            System.out.println("El resultado es: " + division);

        }catch (InputMismatchException e){
            System.out.println("¡El valor introducido no es un numero!");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            sc.close();
        }

        System.out.println("Fin del programa");
    }
}