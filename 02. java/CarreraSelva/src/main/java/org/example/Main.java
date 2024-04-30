package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear categorías
        Categoria chico = new Categoria(1, "Circuito Chico", "2 km por selva y arroyos");
        Categoria medio = new Categoria(2, "Circuito Medio", "5 km por selva, arroyos y barro");
        Categoria avanzado = new Categoria(3, "Circuito Avanzado", "10 km por selva, arroyos, barro y escalada en piedra");

        CarreraDeLaSelva carrera = new CarreraDeLaSelva();
        carrera.agregarCategoria(chico);
        carrera.agregarCategoria(medio);
        carrera.agregarCategoria(avanzado);

        // Inscribir  manualmente
        Participante p1 = new Participante(1, "12345678", "Juan", "Pérez", 25, "123-456", "911-911", "O+");
        carrera.inscribirParticipante(chico, p1);

        Participante p2 = new Participante(2, "87654321", "Ana", "Gómez", 17, "654-321", "911-922", "B+");
        carrera.inscribirParticipante(medio, p2);

        Participante p3 = new Participante(3, "34567890", "Carlos", "López", 30, "789-123", "911-933", "AB-");
        carrera.inscribirParticipante(avanzado, p3);

        // Inscribir al azar
        carrera.inscribirParticipantesAlAzar();

        // Mostrar todos los inscriptos en la categoría "Circuito Chico"
        System.out.println("Inscriptos en el Circuito Chico:");
        List<Inscripcion> inscripcionesChico = carrera.obtenerInscripcionesPorCategoria(1);
        for (Inscripcion inscripcion : inscripcionesChico) {
            System.out.println(inscripcion);
        }

        // Desinscribir  participante
        carrera.desinscribirParticipante(1); // Desinscribe a Juan Pérez
        System.out.println("\nDespués de desinscribir al participante con número 1:");
        inscripcionesChico = carrera.obtenerInscripcionesPorCategoria(1);
    }



    }
