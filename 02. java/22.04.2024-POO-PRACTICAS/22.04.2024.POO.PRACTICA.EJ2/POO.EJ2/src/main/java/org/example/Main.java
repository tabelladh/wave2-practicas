package org.example;

public class Main {
    public static void main(String[] args) {

                Alumno[] alumnos = new Alumno[10];

                // Aquí puedes agregar los alumnos al vector.
                alumnos[0] = new Alumno("Juan", "Perez", 12345678, 8.5f);
                alumnos[1] = new Alumno("Maria", "Gomez", 87654321, 9.0f);
                alumnos[2] = new Alumno("Carlos", "Rodriguez", 23456789, 7.8f);
                alumnos[3] = new Alumno("Ana", "Martinez", 34567890, 8.7f);
                alumnos[4] = new Alumno("Pedro", "Gonzalez", 45678901, 9.2f);
                alumnos[5] = new Alumno("Carmen", "Lopez", 56789012, 8.9f);
                alumnos[6] = new Alumno("Luis", "Ramirez", 67890123, 7.6f);
                alumnos[7] = new Alumno("Sofia", "Torres", 78901234, 9.1f);
                alumnos[8] = new Alumno("Diego", "Sanchez", 89012345, 8.3f);
                alumnos[9] = new Alumno("Isabel", "Castro", 90123456, 9.4f);

                Alumno mejorAlumno = alumnos[0];
                for (int i = 1; i < alumnos.length; i++) {
                    if (alumnos[i].getPromedio() > mejorAlumno.getPromedio()) {
                        mejorAlumno = alumnos[i];
                    }
                }

                System.out.println("El alumno con el mejor promedio es:");
                System.out.println("Nombre: " + mejorAlumno.getNombre());
                System.out.println("Apellido: " + mejorAlumno.getApellido());
                System.out.println("Promedio: " + mejorAlumno.getPromedio());
            }
        }




