package org.example;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno(41287959, "Josefina", "Eberhardt", 7.8);
        Alumno alumno2 = new Alumno(37465789, "Alan", "Perez", 6.8);
        Alumno alumno3 = new Alumno(41288765, "Javi", "Paz", 9.8);
        Alumno alumno4 = new Alumno(43287959, "Monica", "Pa", 5.8);
        Alumno alumno5 = new Alumno(41287979, "Mariano", "Saso", 8.3);
        Alumno alumno6 = new Alumno(41287950, "Daniel", "Gonzalez", 7.8);
        Alumno alumno7 = new Alumno(60287959, "Horacio", "Vasta", 8.8);
        Alumno alumno8 = new Alumno(41287959, "Geri", "ka", 9.7);
        Alumno alumno9 = new Alumno(41287959, "Tomas", "Wi", 3.6);
        Alumno alumno10 = new Alumno(41287959, "Romi", "Zi", 5.2);


        Alumno[] alumnos = new Alumno[10];
        alumnos[0] = alumno1;
        alumnos[1] = alumno2;
        alumnos[2] = alumno3;
        alumnos[3] = alumno4;
        alumnos[4] = alumno5;
        alumnos[5] = alumno6;
        alumnos[6] = alumno7;
        alumnos[7] = alumno8;
        alumnos[8] = alumno9;
        alumnos[9] = alumno10;

        double promedioMasAlto = Double.MIN_VALUE;
        int posicionPromedioMasAlto = -1;

        for (int i = 0; i < alumnos.length; i++) {
            Alumno datosAlumno = alumnos[i];
            double promedioAlumno = datosAlumno.getPromedio();
            if(promedioAlumno > promedioMasAlto){
                promedioMasAlto = promedioAlumno;
                posicionPromedioMasAlto = i;
            }
        }

        Alumno mejorAlumno = alumnos[posicionPromedioMasAlto];

        System.out.println("El mejor alumno es " + mejorAlumno.getNombre()+ " " + mejorAlumno.getApellido() + "con un promedio de " + mejorAlumno.getPromedio());

}
}