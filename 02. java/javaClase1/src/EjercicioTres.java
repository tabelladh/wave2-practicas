import java.util.Scanner;

public class EjercicioTres {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Cuantos dias realizará la campaña: ");
        int diasCampana = scanner.nextInt();


        double costo = diasCampana * 2;


        System.out.println("El costo de la campaña es: $" + costo);


        scanner.close();
    }
}

