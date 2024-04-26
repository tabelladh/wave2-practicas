package org.example;

public class Ejecutivo implements  IDeposito,ITransferencia{
    @Override
    public void transaccionOk() {
        System.out.println("Transacción realizada correctamente.");


    }

    @Override
    public void transaccionFallida() {
        System.out.println("Error en la transacción.");

    }

}