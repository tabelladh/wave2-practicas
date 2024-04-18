package org.example;

import java.util.*;

class Participante {
    private int numero;
    private String dni;
    private String nombre;
    private String apellido;
    private int edad;
    private String celular;
    private String emergencia;
    private String grupoSanguineo;

    public Participante(int numero, String dni, String nombre, String apellido, int edad, String celular, String emergencia, String grupoSanguineo) {
        this.numero = numero;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.celular = celular;
        this.emergencia = emergencia;
        this.grupoSanguineo = grupoSanguineo;
    }

    public int getEdad() {
        return edad;
    }
}

class Categoria {
    private int id;
    private String nombre;
    private String descripcion;

    public Categoria(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }
}

public class CarreraDeLaSelva {
    public static void main(String[] args) {
        // Crear categorías
        Categoria circuitoChico = new Categoria(1, "Circuito chico", "2 km por selva y arroyos.");
        Categoria circuitoMedio = new Categoria(2, "Circuito medio", "5 km por selva, arroyos y barro.");
        Categoria circuitoAvanzado = new Categoria(3, "Circuito avanzado", "10 km por selva, arroyos, barro y escalada en piedra.");

        // Crear mapa para almacenar participantes inscritos en cada categoría
        Map<Categoria, List<Participante>> inscripciones = new HashMap<>();
        inscripciones.put(circuitoChico, new ArrayList<>());
        inscripciones.put(circuitoMedio, new ArrayList<>());
        inscripciones.put(circuitoAvanzado, new ArrayList<>());

