package org.example;

public class Cobrador implements  RetiroEfectivo,ConsultaSaldo{
    @Override
    public void transaccionOk() {
        System.out.println("Transacción realizada correctamente.");

    }

    @Override
    public void transaccionFallida() {
        System.out.println("Error en la transacción.");
    }
}
