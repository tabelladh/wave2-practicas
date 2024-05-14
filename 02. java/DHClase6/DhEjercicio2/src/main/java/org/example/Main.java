package org.example;

public class Main {
    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[10];


        alumnos[0] = new Alumno(12345678, "Juan", "Perez", 8.5);
        alumnos[1] = new Alumno(23456789, "Maria", "Gomez", 9.2);
        alumnos[2] = new Alumno(34567890, "Pedro", "Lopez", 7.8);
        alumnos[3] = new Alumno(45678901, "Ana", "Martinez", 6.3);
        alumnos[4] = new Alumno(56789012, "Luis", "Hernandez", 8.0);
        alumnos[5] = new Alumno(67890123, "Carlos", "Ramirez", 9.8);
        alumnos[6] = new Alumno(78901234, "Laura", "Sanchez", 7.5);
        alumnos[7] = new Alumno(89012345, "Jorge", "Gonzalez", 6.9);
        alumnos[8] = new Alumno(90123456, "Sofia", "Ramirez", 8.2);
        alumnos[9] = new Alumno(12345678, "Luis", "Hernandez", 9.0);
        


        Alumno mejorAlumno = alumnos[0];
        for (int i = 1; i < alumnos.length; i++) {
            if (alumnos[i] != null && alumnos[i].getPromedio() > mejorAlumno.getPromedio()) {
                mejorAlumno = alumnos[i];
            }
        }


        System.out.println("El mejor promedio es de " + mejorAlumno.getNombreCompleto() +
                " con un promedio de " + mejorAlumno.getPromedio());
    }
}
