package org.example;

public class Ejecutivo implements ICliente{

    public void deposito() {
        System.out.println("usted esta realizando un depósito: ");
    }

    public void transferencia() {
        System.out.println("usted esta realizando una transferencia: ");
    }

    public Ejecutivo() {
    }

    @Override
    public void transaccionOk() {
        System.out.println("Transaccion realizada correctamente");
    }

    @Override
    public void transaccionNoOk() {
        System.out.println("No se pudo realizar esta operación");
    }
}
