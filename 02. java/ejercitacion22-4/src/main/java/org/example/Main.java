package org.example;

public class Main {
    public static void main(String[] args) {

        //actividad1
        Persona persona1 = new Persona();
        Persona persona2 = new Persona(1111, "pepe", 32, 95.6, 1.85);
        //actividad2

        Alumno[] alumnos = new Alumno[10];
        alumnos[0] = new Alumno(10, "pepe", "pepo", 6.5);
        alumnos[1] = new Alumno(11, "matias", "ogg", 6.0);
        alumnos[2] = new Alumno(12, "fran", "laz", 7.5);
        alumnos[3] = new Alumno(13, "mac", "ruf", 5.5);
        alumnos[4] = new Alumno(14, "mel", "van", 6.9);
        alumnos[5] = new Alumno(15, "jos", "eber", 8.5);
        alumnos[6] = new Alumno(16, "ger", "pop", 3.4);
        alumnos[7] = new Alumno(17, "joa", "prof", 5.5);
        alumnos[8] = new Alumno(18, "ros", "alia", 9.5);
        alumnos[9] = new Alumno(19, "pipo", "algo", 6.5);


        String nombre = "";
        double promedio = 0.0;
        for (Alumno alumno : alumnos) {
            if (alumno.getPromedio() > promedio) {
                nombre = alumno.getNombre();
                promedio = alumno.getPromedio();
                }
            }
            System.out.println("el mejor promedio corresponde a " + nombre + " y su promedio es " + promedio);

    }
}