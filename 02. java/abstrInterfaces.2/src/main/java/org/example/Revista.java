package org.example;

public class Revista extends Articulo implements NoPrestable{
    private Integer numEdicion;
    private Integer mes;
    private boolean utilizadoEnBiblioteca;

    public Revista(String codigo, String nombre, Integer anioPublicacion, Integer numEdicion, Integer mes, boolean utilizadoEnBiblioteca) {
        super(codigo, nombre, anioPublicacion);
        this.numEdicion = numEdicion;
        this.mes = mes;
        this.utilizadoEnBiblioteca = false;
    }


    @Override
    public String mostrarAtributos() {
        return "Numero de edicion: "+ numEdicion+ "mes: " + mes;
    }
    @Override
    public String utilizarEnBiblioteca() {
        this.utilizadoEnBiblioteca = true;
        return "Revista utilizada en biblioteca";
    }
    @Override
    public String devolverEnBiblioteca() {
        this.utilizadoEnBiblioteca = false;
        return "Revista devuelta en biblioteca";
    }


}

