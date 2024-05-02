package org.example.integrador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        clientes.add(new Cliente("12345678", "Juan", "Perez"));
        clientes.add(new Cliente("23456789", "Maria", "Gonzalez"));
        clientes.add(new Cliente("34567890", "Luis", "Martinez"));

        System.out.println("Datos de los clientes:");
        clientes.stream().forEach(System.out::println);

        System.out.println("\nIngrese el DNI del cliente que desea eliminar: ");
        String dniEliminar = scanner.nextLine();
        clientes = clientes.stream()
                .filter(cliente -> !cliente.getDni().equals(dniEliminar))
                .toList();

        System.out.println("\nClientes restantes después de eliminar uno:");
        clientes.stream().forEach(System.out::println);

        // Buscar un cliente por DNI
        System.out.println("\nIngrese el DNI del cliente a buscar: ");
        String dniBuscar = scanner.nextLine();
        try {
            boolean clienteEncontrado = clientes.stream()
                    .anyMatch(cliente -> cliente.getDni().equals(dniBuscar));

            if (clienteEncontrado) {
                System.out.println("Cliente encontrado:");
                clientes.stream()
                        .filter(cliente -> cliente.getDni().equals(dniBuscar))
                        .forEach(System.out::println);
            } else {
                throw new RuntimeException("El cliente no se encuentra en la lista.");
            }
        } catch (Exception e) {
            System.out.println("Error al buscar el cliente: " + e.getMessage());
        }
    }
}