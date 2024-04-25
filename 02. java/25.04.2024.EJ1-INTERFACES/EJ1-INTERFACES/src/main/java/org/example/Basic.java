package org.example;

public class Basic {
    private Transaccion deposito = new Deposito();
    private Transaccion transferencia = new Transferencia();
    private Transaccion consultaSaldo = new ConsultaSaldo();

    public void realizarDeposito() {
        if ((int) (Math.random() * 10) > 5){deposito.transaccionOk();}
        else{deposito.transaccionNoOk();}
    }
    public void realizarTransferencia() {
        if ((int) (Math.random() * 10) > 5){transferencia.transaccionOk();}
        else {  transferencia.transaccionNoOk(); }

    }

    public void ConsultarSaldo() {
        if ((int) (Math.random() * 10) > 5){consultaSaldo.transaccionOk();}
        else {  consultaSaldo.transaccionNoOk(); }
    }

}
