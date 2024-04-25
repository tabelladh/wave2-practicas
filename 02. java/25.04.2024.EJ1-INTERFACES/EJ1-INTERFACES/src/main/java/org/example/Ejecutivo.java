package org.example;

public class Ejecutivo {
    private Transaccion deposito = new Deposito();
    private Transaccion transferencia = new Transferencia();

    public void realizarDeposito() {
        if ((int) (Math.random() * 10) > 5){deposito.transaccionOk();}
        else{deposito.transaccionNoOk();}
    }
    public void realizarTransferencia() {
        if ((int) (Math.random() * 10) > 5){transferencia.transaccionOk();}
        else{transferencia.transaccionNoOk();}
    }
}

