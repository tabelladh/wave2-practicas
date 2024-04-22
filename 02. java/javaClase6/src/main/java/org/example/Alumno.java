package org.example;

public class Alumno {

    int dni;
     String nombre;
     String apellido;
     double promedio;

     public Alumno (int dni, String nombre, String apellido, double promedio) {

         this.dni = dni;
         this.nombre = nombre;
         this.apellido = apellido;
         this.promedio = promedio;
     }

     public  String getNombre(){
         return  nombre;
     }

    public  String getApellido(){
        return  apellido;
    }

    public  double getPromedio(){
        return  promedio;
    }
}


