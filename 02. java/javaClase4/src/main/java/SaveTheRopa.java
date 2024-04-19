import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class SaveTheRopa {
    public static void main(String[] args) {

        HashMap<Integer, String> guardaRopa = new HashMap<>();
        guardaRopa.put(1, "Buzo Nike");
        guardaRopa.put(2, "Tapado Perramus");
        guardaRopa.put(3, "Saco Lacoste");
        guardaRopa.put(4, "Campera La Dolfina");


        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese el número de Ticket de la prenda que desea retirar: ");
        int numeroTicket = scanner.nextInt();


        boolean encontrado = false;
        for (Map.Entry<Integer, String> entrada : guardaRopa.entrySet()) {
            if (entrada.getKey() == numeroTicket) {
                String prendaRetirada = entrada.getValue();
                encontrado = true;


                guardaRopa.remove(numeroTicket);


                System.out.println("Usted retiró la prenda: " + prendaRetirada);
                break;
            }
        }


        if (!encontrado) {
            System.out.println("El número de Ticket ingresado no existe en el guardarropa.");
        }

        scanner.close();
    }


}
