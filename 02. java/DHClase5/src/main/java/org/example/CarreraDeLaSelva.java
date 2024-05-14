package org.example;

import org.example.Categoria;
import org.example.Inscripcion;
import org.example.Participante;

import java.util.ArrayList;

public class CarreraDeLaSelva {
    public static void main(String[] args) {
        // Crear categorías
        Categoria categoriaChico = new Categoria(1, "Circuito chico", "2 km por selva y arroyos.");
        Categoria categoriaMedio = new Categoria(2, "Circuito medio", "5 km por selva, arroyos y barro.");
        Categoria categoriaAvanzado = new Categoria(3, "Circuito avanzado", "10 km por selva, arroyos, barro y escalada en piedra.");

        // Crear algunos participantes
        Participante participante1 = new Participante(1, 12345678, "Juan", "Perez", 25, "123456789", "987654321", "A+");
        Participante participante2 = new Participante(2, 87654321, "Maria", "Gomez", 17, "987654321", "123456789", "AB-");
        Participante participante3 = new Participante(3, 56781234, "Carlos", "Lopez", 30, "456789123", "987123654", "O+");
        Participante participante4 = new Participante(4, 43215678, "Laura", "Rodriguez", 20, "654321987", "321987654", "B+");

        // Crear inscripciones
        Inscripcion inscripcion1 = new Inscripcion(1, categoriaChico, participante1, 0);
        inscripcion1.calcularMontoInscripcion(); // Calcular el monto de la inscripción

        Inscripcion inscripcion2 = new Inscripcion(2, categoriaChico, participante2, 0);
        inscripcion2.calcularMontoInscripcion(); // Calcular el monto de la inscripción

        Inscripcion inscripcion3 = new Inscripcion(3, categoriaMedio, participante3, 0);
        inscripcion3.calcularMontoInscripcion(); // Calcular el monto de la inscripción

        Inscripcion inscripcion4 = new Inscripcion(4, categoriaAvanzado, participante4, 0);
        inscripcion4.calcularMontoInscripcion(); // Calcular el monto de la inscripción


        // Lista de inscripciones
        ArrayList<Inscripcion> inscripciones = new ArrayList<>();
        inscripciones.add(inscripcion1);
        inscripciones.add(inscripcion2);
        inscripciones.add(inscripcion3);
        inscripciones.add(inscripcion4);

        // Mostrar todos los participantes inscriptos
        mostrarTodosLosParticipantes(inscripciones);

        // Mostrar inscriptos en una categoría
        mostrarInscriptosPorCategoria(inscripciones, categoriaChico);

        // Desinscribir a un participante
        desinscribirParticipante(inscripciones, inscripcion3);

        // Mostrar inscriptos en la categoría después de desinscripción
        mostrarInscriptosPorCategoria(inscripciones, categoriaMedio);

        // Mostrar todos los participantes inscriptos
        mostrarTodosLosParticipantes(inscripciones);

        // Calcular monto total recaudado por categoría
        double totalChico = calcularTotalPorCategoria(inscripciones, categoriaChico);
        double totalMedio = calcularTotalPorCategoria(inscripciones, categoriaMedio);
        double totalAvanzado = calcularTotalPorCategoria(inscripciones, categoriaAvanzado);

        // Calcular monto total de la carrera
        double montoTotal = totalChico + totalMedio + totalAvanzado;

        // Mostrar resultados
        System.out.println("Monto total recaudado por categoría:");
        System.out.println("Circuito chico: $" + totalChico);
        System.out.println("Circuito medio: $" + totalMedio);
        System.out.println("Circuito avanzado: $" + totalAvanzado);
        System.out.println("Monto total de la carrera: $" + montoTotal);
    }

    // Método para mostrar inscriptos en una categoría
    public static void mostrarInscriptosPorCategoria(ArrayList<Inscripcion> inscripciones, Categoria categoria) {
        System.out.println("Inscriptos en la categoría " + categoria.nombre + ":");
        for (Inscripcion inscripcion : inscripciones) {
            if (inscripcion.categoria == categoria) {
                System.out.println("Número de inscripción: " + inscripcion.numeroInscripcion);
                System.out.println("Participante: " + inscripcion.participante.nombre + " " + inscripcion.participante.apellido);
                System.out.println("Edad: " + inscripcion.participante.edad);
                System.out.println("Celular: " + inscripcion.participante.celular);
                System.out.println("Número de emergencia: " + inscripcion.participante.emergencia);
                System.out.println("Grupo sanguíneo: " + inscripcion.participante.grupoSanguineo);
                System.out.println("Monto a abonar: $" + inscripcion.monto);
                System.out.println("----------------------");
            }
        }
    }

    // Método para desinscribir a un participante
    public static void desinscribirParticipante(ArrayList<Inscripcion> inscripciones, Inscripcion inscripcion) {
        inscripciones.remove(inscripcion);
    }

    // Método para calcular monto total recaudado por categoría
    public static double calcularTotalPorCategoria(ArrayList<Inscripcion> inscripciones, Categoria categoria) {
        double total = 0;
        for (Inscripcion inscripcion : inscripciones) {
            if (inscripcion.categoria == categoria) {
                total += inscripcion.monto;
            }
        }
        return total;
    }

    // Método para mostrar todos los participantes

    public static void mostrarTodosLosParticipantes(ArrayList<Inscripcion> inscripciones) {
        for (Inscripcion inscripcion : inscripciones) {
            System.out.println("Todos los participantes inscriptos:");
            System.out.println("Circuito: " + inscripcion.categoria.nombre);
            System.out.println("Numero de inscripción: " + inscripcion.numeroInscripcion);
            System.out.println("Participante: " + inscripcion.participante.nombre + " " + inscripcion.participante.apellido);
            System.out.println("Celular: " + inscripcion.participante.celular);
            System.out.println("Monto a abonar: $" + inscripcion.monto);
            System.out.println("----------------------");
    }
    }
}
