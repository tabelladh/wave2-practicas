package org.example;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Alumno[] alumnos = new Alumno[10];

        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese los datos del alumno " + (i+1) + ":"  );
            Alumno alumno = new Alumno();
            System.out.println("DNI:");
            alumno.setDni(scanner.nextLine());
            System.out.println("Nombre:");
            alumno.setNombre(scanner.nextLine());
            System.out.println("Apellido:");
            alumno.setApellido(scanner.nextLine());
            System.out.println("Promedio:");
            alumno.setPromedio(scanner.nextDouble());
            scanner.nextLine();

            // Guardar el objeto Alumno en el array
            alumnos[i] = alumno;
        }
        
        //Buscar el alumno con mejor promedio

        Alumno mejorPromedio = alumnos[0];

        for (int i = 1; i < alumnos.length; i++) {
            if (alumnos[i].getPromedio() > mejorPromedio.getPromedio()) {
                mejorPromedio = alumnos[i];
            }
            
        }

        System.out.println("El mejor promedio es de: " + mejorPromedio.getNombre() + " " + mejorPromedio.getApellido()
                + " con un promedio de " + mejorPromedio.getPromedio());


    }
}