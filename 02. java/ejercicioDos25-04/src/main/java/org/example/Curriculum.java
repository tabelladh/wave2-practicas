package org.example;

public class Curriculum  extends Articulo{

    private String nombre;
    private int edad;

    public Curriculum() {
    }

    public Curriculum(int idProducto, String nombre, int edad) {
        super(idProducto);
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void imprimir() {
        System.out.println("Curriculum: " +
                            "\nidProducto: " + getIdProducto() +
                            "\nnombre: " + nombre+
                            "\nedad: " + edad);
    }
}
