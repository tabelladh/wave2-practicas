package org.example;

public class Basic implements IConsultaSaldo, IPagoServicio,IRetiroEfectivo {
    @Override
    public void transaccionOk() {
        System.out.println("Transacción realizada correctamente.");


    }

    @Override
    public void transaccionFallida() {
        System.out.println("Error en la transacción.");
    }
}