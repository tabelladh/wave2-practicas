package org.example;

public class HornoElectrico extends Electrodomestico{

    private int tempMaxima;
    private boolean poseeGrill;
    private boolean poseeAutoLimpieza;

    public HornoElectrico() {
    }

    public HornoElectrico(int codigo, String nombre, String marca, String modelo, String descripcion, int cantidad, int precioCosto, int precioVenta, int tempMaxima, boolean poseeGrill, boolean poseeAutoLimpieza) {
        super(codigo, nombre, marca, modelo, descripcion, cantidad, precioCosto, precioVenta);
        this.tempMaxima = tempMaxima;
        this.poseeGrill = poseeGrill;
        this.poseeAutoLimpieza = poseeAutoLimpieza;
    }

    public int getTempMaxima() {
        return tempMaxima;
    }

    public void setTempMaxima(int tempMaxima) {
        this.tempMaxima = tempMaxima;
    }

    public boolean isPoseeGrill() {
        return poseeGrill;
    }

    public void setPoseeGrill(boolean poseeGrill) {
        this.poseeGrill = poseeGrill;
    }

    public boolean isPoseeAutoLimpieza() {
        return poseeAutoLimpieza;
    }

    public void setPoseeAutoLimpieza(boolean poseeAutoLimpieza) {
        this.poseeAutoLimpieza = poseeAutoLimpieza;
    }

    @Override
    public String aumentarStock() {
        return "El stock de hornos aumento";
    }

    @Override
    public String descontarStock() {
        return "El stock de hornos disminuyo";
    }

    @Override
    public String vender() {
        return "Vendiendo Hornos";
    }

    @Override
    public String toString() {
        return "HornoElectrico{" +
                "tempMaxima=" + tempMaxima +
                ", poseeGrill=" + poseeGrill +
                ", poseeAutoLimpieza=" + poseeAutoLimpieza +
                ", codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", cantidad=" + cantidad +
                ", precioCosto=" + precioCosto +
                ", precioVenta=" + precioVenta +
                '}';
    }
}
