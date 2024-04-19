package CarreraSelva;

import java.util.*;

public class CarreraSelva {
    public static void main(String[] args) {
        // Crear categorías
        Categoria circuitoChico = new Categoria(1, "Circuito chico", "2 km por selva y arroyos.", 1300.00f, 1500.00f );
        Categoria circuitoMedio = new Categoria(2, "Circuito medio", "5 km por selva, arroyos y barro.", 2000.00f, 2300.00f);
        Categoria circuitoAvanzado = new Categoria(3, "Circuito avanzado", "10 km por selva, arroyos, barro y escalada en piedra.", 0.00f, 2800.00f );

        // Crear participantes
        Participante participante1 = new Participante(1, "12345678", "Juan", "Perez", 20, "123456789", "987654321", "AB+");
        Participante participante2 = new Participante(2, "87654321", "Maria", "Lopez", 16, "987654321", "123456789", "O-");
        Participante participante3 = new Participante(3, "11111111", "Pedro", "Garcia", 25, "555555555", "666666666", "A+");
        Participante participante4 = new Participante(4, "31832064", "Matias", "Gracias", 27, "9999999", "777777777", "X+");

        // Inscribir al azar algunos participantes
        Participante[] participantes = {participante1, participante2, participante3, participante4};
        Categoria[] categorias = {circuitoChico, circuitoMedio, circuitoAvanzado};

        List<Inscripcion> inscripciones = new ArrayList<>();
        inscripciones.add(new Inscripcion(1, circuitoMedio, participante2));
        inscripciones.add(new Inscripcion(2, circuitoChico, participante1));
        inscripciones.add(new Inscripcion(3, circuitoAvanzado, participante3));
        inscripciones.add(new Inscripcion(4, circuitoAvanzado, participante4));

        // Mostrar participantes de una categoría
        mostrarParticipantesCategoria(circuitoAvanzado, inscripciones);


        // Desinscribir a un participante y mostrar como queda luego la categoria a la que pertenecia.
        desinscribirParticipante(participante4, inscripciones);
        System.out.println("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

        // Calcular montos recaudados por categoria y de la carrera.
        calcularMontosRecaudados(inscripciones, categorias);

    }
    public static void mostrarParticipantesCategoria(Categoria categoria, List<Inscripcion> inscriptos ) {
        System.out.println("Participantes inscritos en la categoría " + categoria.getNombre() + ":");
        for (Inscripcion inscripcion : inscriptos) {
            if (inscripcion.getCategoria() != null && inscripcion.getCategoria().getId() == (categoria.getId())) {
                System.out.println(inscripcion.getParticipante().getNombre() + " " + inscripcion.getParticipante().getApellido() + " - Número de inscripción: " + inscripcion.getNroInscripcion());
            }
        }
    }

    public static void desinscribirParticipante(Participante participante, List<Inscripcion> inscriptos) {
        Categoria categoria = null;
        int indice = 0;
        for (Inscripcion inscripcion : inscriptos) {
            if (inscripcion.getParticipante().equals(participante)) {
                categoria = inscripcion.getCategoria();
                indice = inscriptos.indexOf(inscripcion);

            }
        }
        inscriptos.remove(indice);

        System.out.println("\n-----------------------------------------");
        System.out.println("Se realizo la desincripcion correctamente");

        mostrarParticipantesCategoria(categoria, inscriptos);
    }

    public static void calcularMontosRecaudados(List<Inscripcion> inscriptos, Categoria[] categorias){
        Map<String, Float> montosPorCategoria = new HashMap<>();
        Float montoTotalCarrera = 0.0f;

        for( Categoria cat : categorias) {montosPorCategoria.put(cat.getNombre(), 0.0f );        }

        for (Inscripcion inscripcion : inscriptos) {
            montoTotalCarrera+=inscripcion.getMontoAbonar();
            Float montoAux = montosPorCategoria.get(inscripcion.getCategoria().getNombre());
            montosPorCategoria.put(inscripcion.getCategoria().getNombre(), (montoAux + inscripcion.getMontoAbonar())    );
        }

        System.out.println("\n------------------------------------------------");
        System.out.println("Montos recaudados por categoría:");
        for (Categoria cat : categorias){
            System.out.println(cat.getNombre() +": " + montosPorCategoria.get(cat.getNombre()));
        }

        System.out.println("\n------------------------------------------------");
        System.out.println("Montos total recaudado en la carrera: " + montoTotalCarrera);

    }
}