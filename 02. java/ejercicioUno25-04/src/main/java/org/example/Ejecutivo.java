package org.example;

public class Ejecutivo implements Operacion,Transaccion{
    @Override
    public String Deposito() {
        return transaccionOk();
    }

    @Override
    public String Transferencia() {
        return transaccionOk();
    }

    @Override
    public String RetiroDeEfectivo() {
        return transaccionNoOk();
    }

    @Override
    public String ConsultaDeSaldo() {
        return transaccionNoOk();
    }

    @Override
    public String PagoDeServicios() {
        return transaccionNoOk();
    }

    @Override
    public String transaccionOk() {
        return "transferencia exitosa";
    }

    @Override
    public String transaccionNoOk() {
        return "no se pudo realizar la operacion";
    }
}
