package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        class Alumnos{
            Integer dni;
            String nombre;
            String apellido;
            Double promedio;


            public Alumnos(){

            }

            public Alumnos(Integer dni, String nombre, String apellido, Double promedio) {
                this.dni = dni;
                this.nombre = nombre;
                this.apellido = apellido;
                this.promedio = promedio;
            }

            public Integer getDni() {
                return dni;
            }

            public void setDni(Integer dni) {
                this.dni = dni;
            }

            public String getNombre() {
                return nombre;
            }

            public void setNombre(String nombre) {
                this.nombre = nombre;
            }

            public String getApellido() {
                return apellido;
            }

            public void setApellido(String apellido) {
                this.apellido = apellido;
            }

            public Double getPromedio() {
                return promedio;
            }

            public void setPromedio(Double promedio) {
                this.promedio = promedio;
            }

        };

        Alumnos[] alumnos = {
                new Alumnos(12345678, "Juan", "Perez", 8.5),
                new Alumnos(30789050, "Maria", "Lopez", 7.8),
                new Alumnos(20342767, "Pedro", "Gomez", 9.2),
                new Alumnos(50225432, "Lucas", "Gimenez", 7.6),
                new Alumnos(43660786, "Juana", "Martino", 6.2),
                new Alumnos(32124322, "Ada", "Bravo", 8.3),
                new Alumnos(40987789, "Luis", "Jaime", 7.2),
                new Alumnos(34523467, "Nicolas", "Perren", 9.5),
                new Alumnos(50615786, "Jorge", "Vicentini", 9.8),
                new Alumnos(36770545, "Emanuel", "Peretti", 6.2),
        };


        //inicializo variable para promedio
        Double mejorPromedio = (double) 0;
        String mejorAlumno = null;

        for (int i = 0; i < alumnos.length; i++) {
            // Pregunto por el mejor promedio
            if (alumnos[i].getPromedio() > mejorPromedio) {
                mejorPromedio = alumnos[i].getPromedio();
                mejorAlumno = alumnos[i].getNombre() + " " + alumnos[i].getApellido();
            }

        }

        System.out.println("El alumno con mejor promedio es: " + mejorAlumno + " con el promedio de: " + mejorPromedio);
    }
}
