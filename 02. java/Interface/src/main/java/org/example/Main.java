package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


            Ejecutivo ejecutivo = new Ejecutivo();
            ejecutivo.transaccionOk();
            ejecutivo.transaccionFallida();

            Basic basic = new Basic();
            basic.transaccionOk();
            basic.transaccionFallida();

            Cobrador cobrador = new Cobrador();
            cobrador.transaccionOk();
            cobrador.transaccionFallida();


        }
        }

