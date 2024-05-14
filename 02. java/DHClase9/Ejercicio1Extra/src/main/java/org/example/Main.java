package org.example;

public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso
        Ejecutivo ejecutivo = new Ejecutivo();
        ejecutivo.realizarDeposito();
        ejecutivo.transaccionOk();

        Basico basico = new Basico();
        basico.realizarConsultaSaldo();
        basico.transaccionNoOk();

        Cobrador cobrador = new Cobrador();
        cobrador.realizarConsultaSaldo();
        cobrador.transaccionOk();
    }
}