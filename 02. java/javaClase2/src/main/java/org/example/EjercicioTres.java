package org.example;

public class EjercicioTres {

        private static final double PRECIO_SERVICIO_1 = 1500;
        private static final double PRECIO_SERVICIO_2 = 1500 + 700;

        public static double calcularMontoFinal(int cliente, int tipoServicio) {
            double montoFinal = 0;

            switch (tipoServicio) {
                case 1:
                    montoFinal = PRECIO_SERVICIO_1;
                    break;
                case 2:
                    montoFinal = PRECIO_SERVICIO_2;
                    break;
                default:
                    System.out.println("Tipo de servicio inválido.");
                    break;
            }

            System.out.println("Cliente " + cliente + ": Monto final a abonar $" + montoFinal);
            return montoFinal;
        }

        public static void main(String[] args) {
            // Calcular monto final para cada cliente
            calcularMontoFinal(1, 1);
            calcularMontoFinal(2, 2);
            calcularMontoFinal(3, 2);
            calcularMontoFinal(4, 2);
            calcularMontoFinal(5, 1);
            calcularMontoFinal(6, 1);
            calcularMontoFinal(7, 1);
        }
    }

