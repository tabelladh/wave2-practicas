/*
Una tienda de electrodomésticos vende diferentes tipos de productos electrónicos para el hogar.
Para empezar con el modelado, un analista funcional nos recomienda plantear una clase abstracta principal
llamada Electrodomestico que debe contener los siguientes atributos: codigo, nombre, marca, modelo, descripcion,
cantidad, precioCosto, precioVenta y los métodos abstractos: aumentarStock(), descontarStock(), vender().
La tienda de electrodomésticos constantemente incorpora nuevos productos, pero inicialmente decide contar con:
HornoElectrico: Atributos propios: temperaturaMaxima, poseeGrill, poseeAutolimpieza. Métodos: Sobrescribir métodos de clase padre.
PavaElectrica: Atributos propios: temperaturaMaxima, poseeRegulador. Métodos: Sobrescribir métodos de clase padre.
Microondas: Atributos propios: tamanio, poseeBandeja. Métodos: Sobrescribir métodos de la clase padre
A partir del modelado realizado, crear un objeto de cada clase hija (con sus respectivos datos completos atributos
propios y heredados), mostrar sus datos y atributos por pantalla (como si se tratase de un catálogo) y llamar al método vender.
Pista técnica: Para implementar los métodos en cada clase no es necesario realizar cálculos o funciones.
Basta con simplemente colocar un mensaje por pantalla con la acción que se está realizando.
Por ejemplo: System.out.println(“Vendiendo Microondas”).
*/

package org.example.clasesEInterfaces.electrodomestico;

public class Main {
    public static void main(String[] args) {
        // Crear objetos de cada clase hija
        HornoElectrico hornoElectrico = new HornoElectrico(
                "HE001",
                "Horno",
                "MarcaA",
                "Modelo1",
                "Descripción del horno eléctrico",
                10,
                200.0,
                350.0,
                250,
                true,
                true);

        PavaElectrica pavaElectrica = new PavaElectrica(
                "PE001",
                "Pava",
                "MarcaB",
                "Modelo2",
                "Descripción de la pava eléctrica",
                20,
                50.0,
                100.0,
                100,
                true);

        Microondas microondas = new Microondas(
                "MO001",
                "Micro",
                "MarcaC",
                "Modelo3",
                "Descripción del microondas",
                15,
                150.0,
                250.0,
                "Grande",
                true);

        // Mostrar datos y atributos por pantalla
        System.out.println("Catalogo de Electrodomésticos:");
        System.out.println("-------------------------------");
        hornoElectrico.mostrarDetalles();
        System.out.println("-------------------------------");
        pavaElectrica.mostrarDetalles();
        System.out.println("-------------------------------");
        microondas.mostrarDetalles();
        System.out.println("-------------------------------");

        hornoElectrico.vender();
        hornoElectrico.descontarStock();
        System.out.println("-------------------------------");
        pavaElectrica.vender();
        pavaElectrica.descontarStock();
        System.out.println("-------------------------------");
        microondas.vender();
        microondas.descontarStock();
    }
}
