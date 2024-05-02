package org.example.clasesEInterfaces.electrodomestico;

class HornoElectrico extends Electrodomestico {
    private int temperaturaMaxima;
    private boolean poseeGrill;
    private boolean poseeAutolimpieza;

    public HornoElectrico() {
    }

    public HornoElectrico(String codigo, String nombre, String marca, String modelo, String descripcion, int cantidad, double precioCosto, double precioVenta, int temperaturaMaxima, boolean poseeGrill, boolean poseeAutolimpieza) {
        super(codigo, nombre, marca, modelo, descripcion, cantidad, precioCosto, precioVenta);
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

    public void mostrarDetalles() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio de Costo: " + precioCosto);
        System.out.println("Precio de Venta: " + precioVenta);
        System.out.println("Temperatura Máxima: " + temperaturaMaxima);
        System.out.println("Posee Grill: " + poseeGrill);
        System.out.println("Posee Autolimpieza: " + poseeAutolimpieza);
    }

    // Métodos abstractos sobrescritos
    @Override
    public void aumentarStock() {
        System.out.println("Incorporando nuevo horno eléctrico al stock: " + nombre);
    }

    @Override
    public void descontarStock() {
        System.out.println("Descontando horno electrico del stock: " + nombre);
    }

    @Override
    public void vender() {
        System.out.println("Vendiendo horno eléctrico: " + nombre);
    }
}