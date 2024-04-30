package org.example;


    public class Alumno {
        int dni;
        String nombre;
        String apellido;
        double promedio;

        public Alumno() {

        }

        public Alumno(int dni, String nombre, String apellido, double promedio) {
            this.dni = dni;
            this.nombre = nombre;
            this.apellido = apellido;
            this.promedio = promedio;
        }

        public int getDni() {
            return dni;
        }
        public void setDni(int dni) {
            this.dni = dni;
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

        public void setPromedio(double promedio) {
            this.promedio = promedio;
        }

        public static void main(String[] args) {
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
            }}
            System.out.println("El mejor promedio es: " + mejorPromedio.getPromedio()+ " " + mejorPromedio.getNombre() + " "+
            mejorPromedio.getApellido());
        }
        }