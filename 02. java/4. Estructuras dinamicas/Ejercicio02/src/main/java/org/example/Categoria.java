package org.example;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private String id;
    private String nombre;
    private String descripcion;
    private List<Inscripcion> inscriptos;

    public Categoria(String id, String nombre, String descripcion, List<Inscripcion> inscriptos) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.inscriptos = new ArrayList<>();
    }

    public Categoria() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Inscripcion> getInscriptos() {
        return inscriptos;
    }

    public void setInscriptos(List<Inscripcion> inscriptos) {
        this.inscriptos = inscriptos;
    }

    public void inscribirParticipante(Participante participante, double monto) {
        inscriptos.add(new Inscripcion(participante, monto));
    }

    public void desinscribirParticipante(Participante participante) {
        inscriptos.removeIf(inscripcion -> inscripcion.getParticipante().equals(participante));
    }

    public double calcularTotalRecaudado() {
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
