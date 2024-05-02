/*
Un banco tiene diferentes tipos de transacciones que puede llevar a cabo, entre ellas se encuentran:
Depósito, Transferencia, Retiro de Efectivo, Consulta de Saldo y Pago de Servicios. Todas las transacciones
tienen dos métodos en común, que son transaccionOk() y transaccionNoOk().
A partir de esto existen diferentes tipos de clientes que pueden interactuar con el banco:
Ejecutivos: Realizan Depósitos y Transferencias.
Basico: Realizan consultas de saldo, pagos de servicios y retiro de efectivo.
Cobradores: Realizan retiro de efectivo y consulta de saldos.
Implementar el escenario según corresponda para permitir a los clientes mencionados con anterioridad,
el acceso a los diferentes métodos según la operación que deseen realizar.
Pista técnica: Para implementar los métodos en cada clase no es necesario realizar cálculos o funciones.
Basta con simplemente colocar un mensaje por pantalla con la acción que se está realizando. Por ejemplo:
System.out.println(“Depósito realizado correctamente”).
*/
package org.example.clasesEInterfaces.banco;

public class Main {
    public static void main(String[] args) {
        Ejecutivo ejecutivo = new Ejecutivo();
        ejecutivo.transferencia();
        ejecutivo.transaccionOk();

        Basico basico = new Basico();
        basico.pagoServicios();
        basico.transaccionOk();

        Cobrador cobrador = new Cobrador();
        cobrador.retiroEfectivo();
        cobrador.transaccionNoOk();
    }
}