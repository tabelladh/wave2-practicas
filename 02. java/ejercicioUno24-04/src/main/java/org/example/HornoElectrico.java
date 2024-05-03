package org.example;

public class HornoElectrico extends Electrodomestico {

    private int temperaturaMaxima;
    private boolean poseeGrill, poseeAutolimpieza;

    public HornoElectrico() {
    }

    public HornoElectrico(int codigo, int cantidad, String nombre, String modelo, String descripcion,
                          double precioCosto, double precioVenta, int temperaturaMaxima, boolean poseeGrill, boolean poseeAutolimpieza) {
        super(codigo, cantidad, nombre, modelo, descripcion, precioCosto, precioVenta);
        this.temperaturaMaxima = temperaturaMaxima;
        this.poseeGrill = poseeGrill;
        this.poseeAutolimpieza = poseeAutolimpieza;
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
    public void aumentarStock() {
        System.out.println("horno electrico agregado");
    }

    @Override
    public void descontarStock() {
        System.out.println("horno electrico descontado");
    }

    @Override
    public void vender() {
        System.out.println("horno electrico vendido");
    }

    @Override
    public String toString() {
        return "HornoElectrico:" +
                "\ncodigo: "+getCodigo()+
                "\ncantidad: "+getCantidad()+
                "\nnombre: "+getNombre()+
                "\nmodelo: "+getModelo()+
                "\ndescripcion: "+getDescripcion()+
                "\nprecioCosto: "+getPrecioCosto()+
                "\nprecioVenta: "+getPrecioVenta()+
                "\ntemperaturaMaxima: " + temperaturaMaxima +
                "\nposeeGrill: " + poseeGrill +
                "\nposeeAutolimpieza: " + poseeAutolimpieza ;
    }
}
