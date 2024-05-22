package org.example;

public class HornoElectrico extends Electrodomestico{
    private int temperaturaMaxima;
    private boolean poseeGrill;
    private boolean poseeAutolimpieza;

    public HornoElectrico(int codigo, String nombre, String marca, String modelo, String descripcion, int cantidad, Double precioCosto, Double precioVenta, int temperaturaMaxima, boolean poseeGrill, boolean poseeAutolimpieza) {
        super(codigo, nombre, marca, modelo, descripcion, cantidad, precioCosto, precioVenta);
        this.temperaturaMaxima = temperaturaMaxima;
        this.poseeGrill = poseeGrill;
        this.poseeAutolimpieza = poseeAutolimpieza;
    }

    public HornoElectrico() {
    }

    public int getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(int temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public boolean isPoseeGrill() {
        return poseeGrill;
    }

    public void setPoseeGrill(boolean poseeGrill) {
        this.poseeGrill = poseeGrill;
    }

    public boolean isPoseeAutolimpieza() {
        return poseeAutolimpieza;
    }

    public void setPoseeAutolimpieza(boolean poseeAutolimpieza) {
        this.poseeAutolimpieza = poseeAutolimpieza;
    }

    @Override
   public String toString() {
        return super.toString() + "HornoElectrico{" +
                "temperaturaMaxima=" + temperaturaMaxima +
                ", poseeGrill=" + poseeGrill +
                ", poseeAutolimpieza=" + poseeAutolimpieza +
                '}';
    }
    @Override
    public String aumentarStock() {
        return "Aumenta stock de 1 horno eléctrico";
    }

    @Override
    public String descontarStock() {
        return "Disminuye un stock de 1 horno eléctrico";
    }

    @Override
    public String vender() {
        return "Se vendió de 1 horno eléctrico";
    }
}
