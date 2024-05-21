package org.example;

public class Main {
    public static void main(String[] args) {

        String numFabrica = "2";
        double costoInicial = 800.00;
        double costoConEnvio = 0.00;

        switch (numFabrica) {
            case "1":
                costoConEnvio = costoInicial + (costoInicial * 0.07);
                System.out.println("Fabrica 1");
                break;
            case "2":
                costoConEnvio = costoInicial + (costoInicial * 0.15);
                System.out.println("Fabrica 2");
                break;
            case "3":
                costoConEnvio = costoInicial + (costoInicial * 0.22);
                System.out.println("Fabrica 3");
                break;
            default:
                System.out.println("No hay fabricas");
                break;
        }

        double ganancia = costoConEnvio * 0.25;
        double precioFinal = ganancia + costoConEnvio;

        System.out.println("Costo inicial: " + costoInicial);
        System.out.println("Costo con envio: " + costoConEnvio);
        System.out.println("Ganancia: " + ganancia);
        System.out.println("Precio final: " + precioFinal);
        System.out.printf("%.2f%n", precioFinal);

    }
}