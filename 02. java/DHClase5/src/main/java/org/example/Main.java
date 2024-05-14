package org.example;

import java.util.ArrayList;
import java.util.Random;

// Clase Categoría
class Categoria {
    int id;
    String nombre;
    String descripcion;

    public Categoria(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
}

// Clase Participante
class Participante {
    int numero;
    int dni;
    String nombre;
    String apellido;
    int edad;
    String celular;
    String emergencia;
    String grupoSanguineo;

    public Participante(int numero, int dni, String nombre, String apellido, int edad, String celular, String emergencia, String grupoSanguineo) {
        this.numero = numero;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.celular = celular;
        this.emergencia = emergencia;
        this.grupoSanguineo = grupoSanguineo;
    }
}

// Clase Inscripción
class Inscripcion {
    int numeroInscripcion;
    Categoria categoria;
    Participante participante;
    double monto;

    public Inscripcion(int numeroInscripcion, Categoria categoria, Participante participante, double monto) {
        this.numeroInscripcion = numeroInscripcion;
        this.categoria = categoria;
        this.participante = participante;
        this.monto = monto;
    }

    public void calcularMontoInscripcion() {
        if (categoria.nombre.equals("Circuito chico")) {
            monto = (participante.edad < 18) ? 1300 : 1500;
        } else if (categoria.nombre.equals("Circuito medio")) {
            monto = (participante.edad < 18) ? 2000 : 2300;
        } else if (categoria.nombre.equals("Circuito avanzado")) {
            monto = 2800;
        }
    }
}

