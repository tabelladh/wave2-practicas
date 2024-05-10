package org.example;

public class Libro extends Articulo implements Prestable{
   private String autor;
   private boolean prestado;

   public Libro(String codigo, String nombre, Integer anioPublicacion, String autor, boolean prestado) {
       super(codigo, nombre, anioPublicacion);
       this.autor = autor;
       this.prestado = false;
   }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String prestar(){
       prestado = true;
       return "El libro fue prestado";
   }

   @Override
    public String devolver(){
       prestado = false;
       return "El libro no fue prestado";
   }

    @Override
    public String mostrarAtributos() {
        return "Libro: " + codigo +" nombre: " + nombre + " año de publicación: " + anioPublicacion;
    }
}
