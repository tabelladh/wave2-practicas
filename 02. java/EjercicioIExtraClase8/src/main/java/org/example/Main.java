package org.example;


public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso
        Ejecutivo ejecutivo = new Ejecutivo();
        ejecutivo.depositar();
        ejecutivo.transferir();
        System.out.println();
        System.out.println("================================================================");

        Basic basic = new Basic();
        basic.consultarSaldo();
        basic.pagarServicio();
        basic.retirarEfectivo();
        System.out.println();
        System.out.println("================================================================");

        Cobrador cobrador = new Cobrador();
        cobrador.retirarEfectivo();
        cobrador.consultarSaldo();
        System.out.println();
        System.out.println("================================================================");

    }
}