package org.example;
public class Main {
    public static void main(String[] args) {
        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++");
        Microondas microondas= new Microondas(225, "microondas", "samsung", "MS400", "Dispone de función de grill, convección y autolimpieza", 1, 115.000, 220.000, "grande", true);
        System.out.println(microondas.toString());

        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++");
        PavaElectrica pavaElectrica = new PavaElectrica(330, "pavaElectrica", "liliana", "S-310", "pava electrica que posee regulador de temperatura", 1, 50.000, 100.000, 200, true );
        System.out.println(pavaElectrica.toString());

        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++");
        HornoElectrico hornoElectrico = new HornoElectrico(330, "Horno electrico", "ATMA", "T150-GT", "horno de primera calidad", 1, 80.000, 160.000, 400, true , true);
        System.out.println(hornoElectrico.toString());

        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println("AUMENTA STOCK:\n");
        System.out.println(microondas.aumentarStock());
        System.out.println(pavaElectrica.aumentarStock());
        System.out.println(hornoElectrico.aumentarStock());

        System.out.println("VENTA DE PRODUCTO: \n");
        System.out.println(microondas.vender());
        System.out.println(pavaElectrica.vender());
        System.out.println(hornoElectrico.vender());

        System.out.println("DISMINUYE STOCK: \n");
        System.out.println(microondas.descontarStock());
        System.out.println(pavaElectrica.descontarStock());
        System.out.println(hornoElectrico.descontarStock());

    }
}