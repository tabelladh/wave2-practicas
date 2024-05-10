package org.example;

public class Main {
    public static void main(String[] args) {

        HornoElectrico horno = new HornoElectrico("001", "Horno Eléctrico", "Marca1", "Modelo1",
                "Descripción Horno", 10, 150.0, 250.0, 250, true, true);

        PavaElectrica pava = new PavaElectrica("002", "Pava Eléctrica", "Marca2", "Modelo2",
                "Descripción Pava", 20, 50.0, 80.0, 150, true);

        Microondas microondas = new Microondas("003", "Microondas", "Marca3", "Modelo3",
                "Descripción Microondas", 15, 100.0, 180.0, "Grande", true);

        // Mostrar datos de cada objeto
        System.out.println("Catálogo de productos:");
        mostrarDatos(horno);
        mostrarDatos(pava);
        mostrarDatos(microondas);

        // Llamar al método vender de cada objeto
        horno.vender();
        pava.vender();
        microondas.vender();
    }

    // Método para mostrar datos de cada electrodoméstico
    public static void mostrarDatos(Electrodomestico electrodomestico) {
        System.out.println("Código: " + electrodomestico.codigo);
        System.out.println("Nombre: " + electrodomestico.nombre);
        System.out.println("Marca: " + electrodomestico.marca);
        System.out.println("Modelo: " + electrodomestico.modelo);
        System.out.println("Descripción: " + electrodomestico.descripcion);
        System.out.println("Cantidad: " + electrodomestico.cantidad);
        System.out.println("Precio de costo: " + electrodomestico.precioCosto);
        System.out.println("Precio de venta: " + electrodomestico.precioVenta);
        System.out.println();
    }
    }