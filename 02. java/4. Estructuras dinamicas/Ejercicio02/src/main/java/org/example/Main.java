package org.example;

import java.util.ArrayList;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Categoria circuitoChico = new Categoria(
                "1", "Circuito chico", "2 km por selva y arroyos", new ArrayList<>());
        Categoria circuitoMedio = new Categoria(
                "2", "Circuito medio", "5 km por selva, arroyos y barro", new ArrayList<>());
        Categoria circuitoAvanzado = new Categoria(
                "3", "Circuito avanzado", "10 km por selva, arroyos, barro y escalada en piedra", new ArrayList<>());

        Participante participante1 = new Participante(
                "001",
                "87654321",
                "María",
                "Gómez",
                30,
                "987654321",
                "112",
                "A-"
        );

        circuitoChico.inscribirParticipante(participante1, 1500);


        circuitoChico.mostrarInscriptos();
        circuitoMedio.mostrarInscriptos();
        circuitoAvanzado.mostrarInscriptos();


        inscribirParticipantesAlAzar(circuitoChico, circuitoMedio, circuitoAvanzado);

        circuitoChico.desinscribirParticipante(participante1);

        circuitoChico.mostrarInscriptos();

        System.out.println("Total recaudado en Circuito chico: $" + circuitoChico.calcularTotalRecaudado());
        System.out.println("Total recaudado en Circuito medio: $" + circuitoMedio.calcularTotalRecaudado());
        System.out.println("Total recaudado en Circuito avanzado: $" + circuitoAvanzado.calcularTotalRecaudado());
        System.out.println("Total recaudado en la Carrera de la selva: $" + (circuitoChico.calcularTotalRecaudado() +
                circuitoMedio.calcularTotalRecaudado() + circuitoAvanzado.calcularTotalRecaudado()));

    }
    public static void inscribirParticipantesAlAzar(Categoria...categorias){
            Random rand = new Random();
            String[] nombres = {"Carlos", "Maria", "Luis", "Ana", "Pedro", "Laura"};
            String[] apellidos = {"Gomez", "Fernandez", "Rodriguez", "Lopez", "Martinez", "Sanchez", "Diaz"};

            for (Categoria categoria : categorias) {
                for (int i = 0; i < 3; i++) { // Inscribir 3 participantes al azar en cada categoría
                    String nombre = nombres[rand.nextInt(nombres.length)];
                    String apellido = apellidos[rand.nextInt(apellidos.length)];
                    int edad = rand.nextInt(30) + 18; // Edad entre 18 y 48 años
                    String numeroEmergencia = "9" + String.format("%09d", rand.nextInt(1000000000));
                    // Número de emergencia aleatorio de 10 dígitos
                    Participante participante = new Participante(String.valueOf(rand.nextInt(1000)),
                            "12345678", nombre, apellido, edad, "123456789", numeroEmergencia, "O+");
                    double monto = calcularMonto(categoria.getNombre(), participante.getEdad());
                    categoria.inscribirParticipante(participante, monto);
                }
            }
        }

        public static double calcularMonto (String categoria,int edad){
            switch (categoria) {
                case "Circuito chico":
                    return edad < 18 ? 1300 : 1500;
                case "Circuito medio":
                    return edad < 18 ? 2000 : 2300;
                case "Circuito avanzado":
                    return 2800;
                default:
                    return 0;
            }
        }
    }
