package org.example;

import java.lang.reflect.Array;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(31832064, "Franco", "Lazzaroni");
        Cliente cliente2 = new Cliente(31832065, "Joaquin", "Cassina");
        Cliente cliente3 = new Cliente(31832033, "Manuel", "Muract");

        List<Cliente> clientes = new java.util.ArrayList<>(List.of(cliente1,cliente2, cliente3));

        //Mostrar los clientes.
        clientes.stream().forEach(System.out::println);

        //Eliminar uno y mostrar la lista resultante
        clientes.remove(cliente2);
        clientes.stream().forEach(System.out::println);

        Scanner scan = new Scanner(System.in);
        System.out.println("INGRESE EL DNI DEL CLIENTE A LOCALIZAR : ");
        Integer dniBuscado = scan.nextInt();
        Cliente clienteEncontrado = new Cliente();
        try {  clienteEncontrado = clientes.stream()
                    .filter(x -> x.getDni().equals(dniBuscado))
                    .findFirst()
                    //.orElse(null);
                    .orElseThrow(() -> new RuntimeException("No se encontro ninguna coincidencia"));
        } catch (RuntimeException e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            if(clienteEncontrado.getDni() != null) {        System.out.println( "Los datos del cliente son: " +  clienteEncontrado ); }
        }





    }
}
