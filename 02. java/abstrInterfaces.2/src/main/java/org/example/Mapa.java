package org.example;

public class Mapa extends Articulo implements NoPrestable{
    private boolean utilizadoEnBiblioteca;
    private String tipoMapa;
    private String tamanio;

    public Mapa(String codigo, String nombre, Integer anioPublicacion, String tipoMapa, String tamanio, boolean utilizadoEnBiblioteca){
        super(codigo, nombre, anioPublicacion);
        this.tipoMapa = tipoMapa;
        this.tamanio = tamanio;
        this.utilizadoEnBiblioteca = false;
    }
    public String getTipoMapa() {
        return tipoMapa;
    }
    public void setTipoMapa(String tipoMapa) {
        this.tipoMapa = tipoMapa;
    }
    public String getTamanio() {
        return tamanio;
    }
    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
    public boolean isUtilizadoEnBiblioteca() {
        return utilizadoEnBiblioteca;
    }
    public void setUtilizadoEnBiblioteca(boolean utilizadoEnBiblioteca) {
        this.utilizadoEnBiblioteca = utilizadoEnBiblioteca;
    }


    @Override
    public String mostrarAtributos() {
        return "Mapa: " + tipoMapa + " tamanio: "+ tamanio;
    }

    @Override
    public String utilizarEnBiblioteca(){
        utilizadoEnBiblioteca = true;
        return "El mapa esta siendo utilizado en biblioteca";
    }

    @Override
    public String devolverEnBiblioteca(){
        utilizadoEnBiblioteca = false;
        return "El mapa no fue devuelto en biblioteca";
    }
}
