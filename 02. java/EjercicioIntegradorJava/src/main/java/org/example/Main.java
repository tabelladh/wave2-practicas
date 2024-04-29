package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Cliente cliente1 = new Cliente(34900450, "Marcos", "Martinez");
        Cliente cliente2 = new Cliente(29908950, "Sebastian", "Gutierrez");
        Cliente cliente3 = new Cliente(12346578, "Benicio", "Del Toro");

        List<Cliente> listClientes = new ArrayList<>(List.of(cliente1, cliente2, cliente3));
        listClientes.stream().forEach(System.out::println);
        listClientes.remove(2);
        listClientes.stream().forEach(System.out::println);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el DNI del cliente a buscar: ");
        int dniAbuscar = scanner.nextInt();

        try {
            Cliente clienteEncontrado = listClientes.stream()
                    .filter(cliente -> cliente.getDni() == dniAbuscar)
                    .findFirst()
                    .orElseThrow(() -> new Exception("El cliente con DNI " + dniAbuscar + " no se encuentra en la lista."));

            System.out.println("Cliente encontrado: ");
            System.out.println("DNI: " + dniAbuscar);
            System.out.println("Nombre: " + clienteEncontrado.getNombre());
            System.out.println("Apellido: " + clienteEncontrado.getApellido());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
