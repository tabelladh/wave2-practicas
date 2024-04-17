package org.example;

public class Main {
    public static void main(String[] args) {

        int precioServicio= 1500;
        int precioServicioMasPatrullaje = 700;
        int montoFinal = precioServicio + precioServicioMasPatrullaje;

        for (int cliente = 1; cliente <= 7; cliente++) {
            switch (cliente) {
                case 1:
                    System.out.println("El Cliente 1 abona " + precioServicio);
                    break;
                case 2:
                    System.out.println("El cliente 2 abona " + montoFinal);
                    break;
                case 3:
                    System.out.println("El cliente 3 abona " + montoFinal);
                    break;
                case 4:
                    System.out.println("El cliente 4 abona " + montoFinal);
                    break;
                case 5:
                    System.out.println("El cliente 5 abona " + precioServicio);
                    break;
                case 6:
                    System.out.println("El cliente 6 abona " + precioServicio);
                    break;
                case 7:
                    System.out.println("El cliente 7 abona " + precioServicio);
                    break;
            }
        }
    }
}