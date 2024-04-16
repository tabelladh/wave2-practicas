import java.util.Scanner;

public class EjercicioCuatro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto del premio: ");
        double montoDelPremio = scanner.nextDouble();

        double impuesto1 = montoDelPremio * 0.0245;
        double impuesto2 = montoDelPremio * 0.15;
        double impuesto3 = montoDelPremio * 0.03;

        double montoTotal= montoDelPremio - impuesto1 - impuesto2 - impuesto3;

        System.out.println("El monto a pagar  con descuentos de impuestos es de: $" + montoTotal);

        scanner.close();
    }
}