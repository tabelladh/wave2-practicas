package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] servicioCliente = {1, 2, 3, 4, 5, 6, 7};

        for (int cliente : servicioCliente) {
            switch (cliente) {
                case 1:
                case 5:
                case 6:
                case 7:
                    System.out.println("La factura del cliente " + cliente + " es de $1500");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println("La factura del cliente " + cliente + " es de $2200");
                    break;
            }
        }
    }
}