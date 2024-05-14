package org.example;

class Basico implements ITransacciones {
    @Override
    public void transaccionOk() {
        System.out.println("Transacción ejecutada correctamente");
    }

    @Override
    public void transaccionNoOk() {
        System.out.println("Error en la transacción");
    }

    public void realizarConsultaSaldo() {
        System.out.println("Consulta de saldo realizada correctamente");
    }

    public void realizarPagoServicios() {
        System.out.println("Pago de servicios realizado correctamente");
    }

    public void realizarRetiroEfectivo() {
        System.out.println("Retiro de efectivo realizado correctamente");
    }
}
