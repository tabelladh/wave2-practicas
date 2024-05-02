/*
Como aún no están decididos sobre qué tipos de vehículos venderán, desean que los datos se puedan almacenar
de forma “general”. Los vehiculos deben tener idVehiculo,marca, modelo, color, anioFabricacion y precio.
Además debe poder realizar las siguientes acciones (que son servicios de la concesionaria):
hacerService(), otorgarGarantia(), calibrarCubiertas(). Es suficiente con un mensaje por pantalla,
por ejemplo: System.out.println (“Service de vehículo realizado correctamente”).
Luego, la concesionaria se decidió por vender los siguientes tipos de vehículos:
Moto: Atributo propio: cilindrada. Acciones: debe poder realizar lo mismo que cualquier vehículo pero
especificando que se trata de una moto. Por ejemplo: System.out.println (“Service de motocicleta realizado correctamente”)
Auto: Atributos propios: cantidadPuertas, cantidadAsientos, potenciaMotor Acciones:  Debe poder realizar
lo mismo que cualquier vehículo pero especificando que se trata de una moto. Por ejemplo: System.out.println
(“Cubiertas de automóvil calibradas correctamente”).
Una vez listo el modelado, los dueños de la agencia solicitaron si es posible ingresar por teclado un total de
10 vehículos (5 motos y 5 automóviles) y almacenarlos en alguna estructura que consideremos adecuada.
Para almacenar los vehículos se sugiere la utilización de vectores (arrays). Tener en cuenta que para que un
vector pueda almacenar distintos tipos de vehículos hay que utilizar la propiedad de la POO “Polimorfismo”.
Se sugiere armar un “mini menú” (mediante textos o mensajes) que vayan indicando al usuario qué datos ingresar.
Por ejemplo: System.out.println (“Ingrese el modelo”).
Tener en cuenta que dependiendo de si se trata de un auto o una moto, los mensajes y datos que se pidan pueden
cambiar. Una vez almacenados los 10 vehículos, desean conocer el top 3 de los vehículos más caros
(sin importar si son autos o motos) e informar esto por pantalla.
Además de esto, se requiere que se “realice un service” a esos 3 vehículos
*/

package org.example.propiedadesPOOConcesionaria;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehiculo[] vehiculos = new Vehiculo[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese los datos del vehículo " + (i + 1));
            System.out.print("Marca: ");
            String marca = scanner.nextLine();
            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();
            System.out.print("Color: ");
            String color = scanner.nextLine();
            System.out.print("Año de Fabricación: ");
            int anioFabricacion = scanner.nextInt();
            System.out.print("Precio: ");
            double precio = scanner.nextDouble();
            System.out.print("¿Es una moto o un auto? (moto/auto): ");
            String tipoVehiculo = scanner.next();

            if (tipoVehiculo.equals("moto")) {
                System.out.print("Cilindrada: ");
                int cilindrada = scanner.nextInt();
                vehiculos[i] = new Moto(i + 1, marca, modelo, color, anioFabricacion, precio, cilindrada);
            } else if (tipoVehiculo.equals("auto")) {
                System.out.print("Cantidad de Puertas: ");
                int cantidadPuertas = scanner.nextInt();
                System.out.print("Cantidad de Asientos: ");
                int cantidadAsientos = scanner.nextInt();
                System.out.print("Potencia del Motor: ");
                int potenciaMotor = scanner.nextInt();
                vehiculos[i] = new Auto(i + 1, marca, modelo, color, anioFabricacion, precio, cantidadPuertas, cantidadAsientos, potenciaMotor);
            } else {
                System.out.println("Tipo de vehículo inválido. Por favor, ingrese 'moto' o 'auto'.");
                scanner.nextLine();
                i--;
            }
            // Limpiar el buffer del scanner
            scanner.nextLine();
        }

        // Encontrar el top 3 de vehículos más caros. el metodo .sort ordena el array. El metodo
        // estatico comparingDouble permite ordenar de menor a mayor el array por el atributo precio.
        // El metodo .reverse permite invertir el orden del array.
        Arrays.sort(vehiculos, Comparator.comparingDouble(Vehiculo::getPrecio).reversed());

        System.out.println("Lista de vehículos ingresados:");
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo != null) {
                if (vehiculo instanceof Moto) {
                    System.out.println("Tipo: Moto");
                } else if (vehiculo instanceof Auto) {
                    System.out.println("Tipo: Auto");
                }
            }
        }

        System.out.println("Top 3 de vehículos más caros:");
        DecimalFormat df = new DecimalFormat("#.00");
        for (int i = 0; i < Math.min(3, vehiculos.length); i++) {
            System.out.println((i + 1) + ". " + vehiculos[i].getMarca() + " " + vehiculos[i].getModelo() + " - Precio: $" + df.format(vehiculos[i].getPrecio()));
            vehiculos[i].hacerService();
        }
        scanner.close();
    }
}

