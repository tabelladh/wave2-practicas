package org.example;

abstract class Cliente implements ITransaccion {
    @Override
    public void transaccionOk() {
        System.out.println("La transacción se pudo realizar correctamente");
    }

    @Override
    public void transaccionNoOk() {
        System.out.println("La transacción no se pudo realizar correctamente");
    }
}
