package org.example;

public class Main {
    public static void main(String[] args) {

        Deposito cochera = new Deposito();

        Auto auto1 = new Auto();
        auto1.agregar();


        Vehiculo moto1 = new Moto(2,2024,13000,"kawasaki","bersy",
                    "verde",600);

        Vehiculo auto2 = new Auto(3,1995,17000,"toyota","hilux",
                    "gris",4,3,215);

        cochera.listarVehiculos(auto1);
        cochera.listarVehiculos(auto2);
        cochera.listarVehiculos(moto1);

        System.out.println(cochera.topTres());

    }
}