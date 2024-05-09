package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class Estudiante {


    private String nombre;
    private String apellidos;
    private int dni;
    private List<Materia> materias;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellidos, int dni, List<Materia> materias) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.materias = materias;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return ( nombre +  " " + apellidos +  ", DNI= " + dni );
    }


    public String existeEstudiante(List<Estudiante> listaEstudiantes, int dni) throws NotFoundException {

           Estudiante estudiante = new Estudiante();

           for (int i = 0; i < listaEstudiantes.size(); i++) {
               if (dni == listaEstudiantes.get(i).getDni()) {
                   estudiante = listaEstudiantes.get(i);
               }
           }

           if (dni != estudiante.getDni()) {
               throw new NotFoundException("No se encuentra ese DNI en ningun estudiante");
           }
           return ("Estudiante: " + estudiante);
    }
}

