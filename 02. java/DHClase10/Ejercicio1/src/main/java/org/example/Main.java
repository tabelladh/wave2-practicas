package org.example;

public class Main {
    public static void main(String[] args) {
        Lavado lavado = new Lavado(1, "Lavado", "Sin observaciones");
        Corte corte = new Corte("CorteUno", "Corte", "Corte de pelo corto");

        System.out.println("Datos del lavado:");
        System.out.println("ID: " + lavado.getId() + ", Nombre: " + lavado.getNombre() + ", Observación: " + lavado.getObservacion());

        System.out.println("\nDatos del corte:");
        System.out.println("ID: " + corte.getId() + ", Nombre: " + corte.getNombre() + ", Tipo: " + corte.getTipo());
    }
}