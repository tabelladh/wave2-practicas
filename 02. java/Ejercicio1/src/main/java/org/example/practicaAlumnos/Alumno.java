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

package org.example.practicaAlumnos;

public class Alumno {
    private String dni;
    private String nombre;
    private String apellido;
    private double promedio;

    public Alumno(String nombre, String apellido, double promedio) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getPromedio() {
        return promedio;
    }
}
