package org.example;

public class Main {
    public static void main(String[] args) {

        Basic basic = new Basic();
        Cobrador cobrador = new Cobrador();
        Ejecutivo ejecutivo = new Ejecutivo();

        basic.ConsultarSaldo();
        basic.realizarDeposito();
        basic.realizarTransferencia();

        cobrador.realizarDeposito();
        cobrador.realizarTransferencia();

        ejecutivo.realizarDeposito();
        ejecutivo.realizarTransferencia();

    }
}