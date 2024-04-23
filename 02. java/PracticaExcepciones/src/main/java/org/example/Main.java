package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        Materia materia1 = new Materia("Matematicas", 1);
        Materia materia2 = new Materia("Fisica", 2);

        List<Materia> listaMaterias1 = new ArrayList<>();
        listaMaterias1.add(materia1);
        listaMaterias1.add(materia2);

        Estudiante estudiante1 = new Estudiante("Jose", "Perez", 1, listaMaterias1);
        Estudiante estudiante2 = new Estudiante("Maria", "Gonzalez", 2, listaMaterias1);

        List<Estudiante> listaEstudiantes = new ArrayList<>();
        listaEstudiantes.add(estudiante1);
        listaEstudiantes.add(estudiante2);

        System.out.println(listaEstudiantes);

        Scanner sc = new Scanner(System.in); // Creo un nuevo objeto scanner
        System.out.println("Introduce el DNI del estudiante: ");
        boolean bandera = false;


        try { //Creo el código que necesito ejecutar para que funcione ok - camino feliz

            int consultaDNI = sc.nextInt();  // El scanner debe estar dentro del try para controlar la excepcion de InputMismatchException

            Estudiante est = new Estudiante(); // Creo un nuevo objeto estudiante para guardar informacion
                while (!bandera) {
                   /* for (Estudiante estudiante : listaEstudiantes) { //Recorro toda la lista de estudiantes
                        if (estudiante.getDni() == consultaDNI) {
                            //Si existe un dni igual al que solicito por scanner lo guardo en el objeto "est"
                            est = new Estudiante(estudiante.getNombre(), estudiante.getApellidos(), estudiante.getDni(), estudiante.getMaterias());
                        }
                        bandera = true;
                    }*/

                    //Otra forma de hacer el for
                    for (int i = 0; i < listaEstudiantes.size(); i++) {
                        if (consultaDNI == listaEstudiantes.get(i).getDni()) {
                            est = listaEstudiantes.get(i);
                        }
                        bandera = true;
                    }

                }

                if (est.getDni() == consultaDNI) {
                    System.out.println(est);
                }else {
                    throw new NotFoundException("¡El estudiante no existe!");
                }


        } catch (InputMismatchException e){ // catch para Tipo de dato distinto a el scanner
            System.out.println("¡Ingresaste un valor que no era un número entero!");
            sc = new Scanner(System.in); //reseteamos el scanner
        } catch (NotFoundException ex) { //catch para una excepción personalizada
            System.out.println(ex.getMessage());
            sc = new Scanner(System.in);
        } finally {
            sc.close();
        }

    }
}