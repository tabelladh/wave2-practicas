package org.example;

public class Main {

    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[10];
            alumnos[0] = new Alumno(11700412, "Carlos", "Lopez", 3.2);
            alumnos[1] = new Alumno(11700413, "María", "García", 3.6);
            alumnos[2] = new Alumno(11700414, "Alejandro", "Martinez", 3.8);
            alumnos[3] = new Alumno(11700415, "Laura", "Fernández", 3.1);
            alumnos[4] = new Alumno(11700416, "Santiago", "Díaz", 3.9);
            alumnos[5] = new Alumno(11700417, "Ana", "Rodríguez", 3.3);
            alumnos[6] = new Alumno(11700418, "Pedro", "Sanchez", 3.5);
            alumnos[7] = new Alumno(11700419, "Lucía", "Gómez", 3.7);
            alumnos[8] = new Alumno(11700411, "Miguel", "Vázquez", 3.4);
            alumnos[9] = new Alumno(11700413, "Carmen", "Pérez", 3.0);
        }

        Alumno mejorPromedio = alumnos[0];
        for (int i = 0; i < alumnos.length; i++){
        if (alumnos[i].getpromedio() > mejorPromedio.getPromedio());
        }
    }




    }

