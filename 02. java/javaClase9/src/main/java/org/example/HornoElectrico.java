package org.example;

public class HornoElectrico extends Electrodomestico{
    int temperaturaMaxima;
    boolean poseeGrill;
    boolean poseeAutolimpieza;

    public HornoElectrico(int codigo, String nombre, String marca, String modelo, String descripcion, int cantidad, double precioCosto, double precioVenta, int temperaturaMaxima, boolean poseeGrill, boolean poseeAutolimpieza) {
        super(codigo, nombre, marca, modelo, descripcion, cantidad, precioCosto, precioVenta);
        this.temperaturaMaxima = temperaturaMaxima;
        this.poseeGrill = poseeGrill;
        this.poseeAutolimpieza = poseeAutolimpieza;
    }

    public String toString() {

            String grillBoolean = poseeGrill ? "sí" : "no";
            String autolimpiezaBoolean = poseeAutolimpieza ? "sí" : "no";


            return super.toString() +
                "Temperatura Máxima: " + temperaturaMaxima + "\n" +
                "Posee Grill: " + grillBoolean + "\n" +
                "Posee Autolimpieza: " + autolimpiezaBoolean + "\n";
    }


        @Override
    void aumentarStock(int cantidad) {

    }

    @Override
    void descontarStock(int cantidad) {

    }

    @Override
    public void vender() {
        System.out.println("Vendiendo Horno Eléctrico.");
    }
}
