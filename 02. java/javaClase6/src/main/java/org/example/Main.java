package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Persona persona1 = new Persona();
//
//        Persona persona2 = new Persona(12345678, "Juan", 30, 70.5, 175.0);
//
//        System.out.println("Persona 1:");
//        System.out.println("DNI: " + persona1.getDni());
//        System.out.println("Nombre: " + persona1.getNombre());
//        System.out.println("Edad: " + persona1.getEdad());
//        System.out.println("Peso: " + persona1.getPeso());
//        System.out.println("Altura: " + persona1.getAltura());
//
//        System.out.println("\nPersona 2:");
//        System.out.println("DNI: " + persona2.getDni());
//        System.out.println("Nombre: " + persona2.getNombre());
//        System.out.println("Edad: " + persona2.getEdad());
//        System.out.println("Peso: " + persona2.getPeso());
//        System.out.println("Altura: " + persona2.getAltura());


        Alumno[] alumnos = new Alumno[10];

        alumnos[0] = new Alumno(12345678, "Juan", "Gomez", 8.5);
        alumnos[1] = new Alumno(23456789, "Maria", "Leiva", 9.2);
        alumnos[2] = new Alumno(15345678, "Pedro", "Ponce", 8.1);
        alumnos[3] = new Alumno(11456789, "Juana", "Perez", 7.2);
        alumnos[4] = new Alumno(36456789, "Maria", "Ortigoza", 6.2);
        alumnos[5] = new Alumno(27456789, "Carlos", "Sanchez", 9.8);
        alumnos[6] = new Alumno(12345678, "Juan", "Salvio", 8.7);
        alumnos[7] = new Alumno(23456789, "Hector", "Sanchez", 6.2);
        alumnos[8] = new Alumno(15345678, "Pedro", "Gonzalez", 7.5);
        alumnos[9] = new Alumno(11456789, "Alberto", "Duran", 9.1);

        Alumno mejorPromedio = alumnos[0];

        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].getPromedio() > mejorPromedio.getPromedio()) {
                mejorPromedio = alumnos[i];
            }
        }

        System.out.println( mejorPromedio.getNombre() +" "+ mejorPromedio.getApellido() +
                " obtuvo el mejor promedio con " + mejorPromedio.getPromedio());
    }
    }
