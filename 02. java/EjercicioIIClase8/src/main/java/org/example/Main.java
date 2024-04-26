package org.example;


public class Main {
    public static void main(String[] args) {
        HornoElectrico horno = new HornoElectrico(001, "Horno Eléctrico", "BGH", "Modelo1", "Horno eléctrico para uso doméstico", 10, 50000, 130000, 250, true, false);
        PavaElectrica pavaElectrica = new PavaElectrica(010,"Pava Eléctrica", "Liliana", "Modelo2", "Pava eléctrica con regulador de temperatura", 20, 15000, 40000, 150, true);
        Microonda microonda = new Microonda(011,"Microonda Eléctrica", "Philips", "Modelo3", "Microonda con display digital", 20, 15000, 40000, "grande", true);

        System.out.println("Catalogo de productos: ");
        System.out.println("======================");
        System.out.println("Horno Eléctrico:");
        System.out.println("Código: " + horno.codigo);
        System.out.println("Nombre: " + horno.nombre);
        System.out.println("Marca: " + horno.marca);
        System.out.println("Modelo: " + horno.modelo);
        System.out.println("Descripción: " + horno.descripcion);
        System.out.println("Temperatura Máxima: " + horno.temperaturaMaxima);
        System.out.println("Grill: " + (horno.poseeGrill ? "posee" : "no posee"));
        System.out.println("Precio: " + horno.precioVenta);
        horno.vender();
        System.out.println();
        System.out.println("======================");
        System.out.println("Pava Eléctrica:");
        System.out.println("Código: " + pavaElectrica.codigo);
        System.out.println("Nombre: " + pavaElectrica.nombre);
        System.out.println("Marca: " + pavaElectrica.marca);
        System.out.println("Modelo: " + pavaElectrica.modelo);
        System.out.println("Descripción: " + pavaElectrica.descripcion);
        System.out.println("Temperatura Máxima: " + pavaElectrica.temperaturaMaxima);
        System.out.println("Regulador: " + (pavaElectrica.poseeRegulador ? "posee" : "no posee"));
        System.out.println("Precio: " + pavaElectrica.precioVenta);
        pavaElectrica.vender();
        System.out.println();
        System.out.println("======================");
        System.out.println("Microonda Eléctrica:");
        System.out.println("Código: " + microonda.codigo);
        System.out.println("Nombre: " + microonda.nombre);
        System.out.println("Marca: " + microonda.marca);
        System.out.println("Modelo: " + microonda.modelo);
        System.out.println("Descripción: " + microonda.descripcion);
        System.out.println("Tamaño: " + microonda.tamanio);
        System.out.println("Bandeja: " + (microonda.poseeBandeja ? "posee" : "no posee"));
        System.out.println("Precio: " + microonda.precioVenta);
        microonda.vender();
        System.out.println();




    }
}