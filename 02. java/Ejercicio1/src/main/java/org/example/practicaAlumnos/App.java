package org.example.practicaAlumnos;
public class App {
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
        App app = new App();
        app.calcularMejorPromedio(alumnos);
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
