import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su apellido:");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese su edad:");
        int edad = scanner.nextInt();

        System.out.println("¿Es usted estudiante? (true/false):");
        boolean estudiante = scanner.nextBoolean();

        System.out.println("Ingrese su sueldo:");
        double sueldo = scanner.nextDouble();


        System.out.println("Hola, soy " + nombre + " " + apellido);
        System.out.println("Tengo " + edad + " años");
        System.out.println("¿Soy estudiante? " + (estudiante ? "Sí" : "No"));
        System.out.println("Mi sueldo es $" + sueldo);


        scanner.close();
    }
}