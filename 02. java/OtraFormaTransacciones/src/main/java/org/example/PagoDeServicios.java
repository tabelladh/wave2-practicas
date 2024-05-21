package org.example;

public class PagoDeServicios implements ITransaccion {
    @Override
    public Boolean transaccionOk() {
        System.out.println("Transacción exitosa para Pago de Servicios");
        return true;
    }

    @Override
    public Boolean transaccionNoOk() {
        System.out.println("No se puede realizar Pago de Servicios");
        return false;
    }
}
