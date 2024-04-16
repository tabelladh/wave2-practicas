import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); //para ingresar un dato por teclado
        System.out.println("ingrese el precio del producto:");
        double precio = scanner.nextDouble();
        System.out.println("ingrese una fabrica");
        int fabrica = scanner.nextInt();

        double total = 0;
      switch (fabrica){
          case 1:
              total = (precio * 1.07 * 1.25);

              System.out.println("El precio de producto es: " + total);
              break;
          case 2:
              total = (precio * 1.15 * 1.25);
              System.out.println("El precio de producto es: " + total);
              break;
          case 3:
              total = (precio * 1.22 * 1.25);
              System.out.println("El precio de producto es: " + total);
              break;
          default:
              System.out.println("No existe ese tipo de fabrica");
              break;
      }

    }



}