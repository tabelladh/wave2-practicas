/*
Una profesora de inglés dicta la materia “Inglés para Programadores” en un instituto de
programación. Como se acerca el cierre de trimestre de la materia, necesita un sistema
que le permita almacenar los datos y promedio de sus 10 alumnos de ésta asignatura.
Para llevar a cabo esto, es necesaria la creación de una clase Alumno que permita almacenar
el dni, nombre, apellido y promedio de cada alumno. Por otro lado, para poder guardar los datos
de los 10 alumnos, se debe crear un vector de 10 posiciones llamado alumnos, en donde en cada una
de las posiciones se asigne, efectivamente, un alumno. A partir de esto, la teacher necesita
conocer cuál es el mayor promedio en su materia.
Realizar una aplicación que permita guardar en un vector los datos de 10 alumnos.
A partir de ello, desarrollar el código necesario para determinar el mejor promedio.
Una vez encontrado el mismo, imprimir por pantalla el nombre, apellido y promedio del mejor
alumno de la materia.
*/

package org.example.poo.practicaAlumnos;
public class Main {
    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[10];
        alumnos[0] = new Alumno("Juan", "Perez", 7.5);
        alumnos[1] = new Alumno("María", "Gonzalez", 8.2);
        alumnos[2] = new Alumno("Pedro", "Perez", 6.9);
        alumnos[3] = new Alumno("Ana", "Martinez", 9.1);
        alumnos[4] = new Alumno("Luis", "Lopez", 7.8);
        alumnos[5] = new Alumno("Carlos", "Rojas", 8.5);
        alumnos[6] = new Alumno("Laura", "Nieto", 7.2);
        alumnos[7] = new Alumno("Marta", "Lopez", 9.9);
        alumnos[8] = new Alumno("Javier", "Gonzalez", 6.5);
        alumnos[9] = new Alumno("Sara", "Bermudez", 8.8);
        Main main = new Main();
        main.calcularMejorPromedio(alumnos);
    }

    public void calcularMejorPromedio(Alumno[] alumnos) {
        double mejorPromedio = 0;
        String mejorAlumno = "";
        for (int i = 0; i < 10; i++) {
            if (alumnos[i].getPromedio() > mejorPromedio) {
                mejorPromedio = alumnos[i].getPromedio();
                mejorAlumno = alumnos[i].getNombre() + " " + alumnos[i].getApellido();
            }
        }
        System.out.println("El mejor promedio es de " + mejorAlumno+ " con un promedio de " + mejorPromedio);
    }
}
