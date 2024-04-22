package org.example.carrera;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private String id;
    private String nombre;
    private String descripcion;
    private List<Inscripcion> inscriptos;

    public Categoria(String id,
                     String nombre,
                     String descripcion,
                     List<Inscripcion> inscriptos) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.inscriptos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void inscribirParticipante(Participante participante, double monto){
        inscriptos.add(new Inscripcion(participante, monto));
    }

    public void desinscribirParticipante(Participante participante){
        inscriptos.removeIf(inscripcion -> inscripcion.getParticipante().equals(participante));
    }

    public double calcularTotalRecaudado () {
        double total = 0;
        for (Inscripcion inscripcion : inscriptos) {
            total += inscripcion.getMonto();
        }
        return total;
    }

    public void mostrarInscriptos() {
        System.out.println("Inscriptos en la categoría " + nombre + ":");
        for (Inscripcion inscripcion : inscriptos) {
            System.out.println(inscripcion.getParticipante().getNombre() + " " +
                    inscripcion.getParticipante().getApellido() + " - Monto: $" +
                    inscripcion.getMonto());
        }
    }
}
