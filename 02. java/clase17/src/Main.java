


public class Main {
    public static <string> void main(String[] args) {

        String[] ciudades = new String[10];

        ciudades[0] = "Londres";
        ciudades[1] = "Madrid";
        ciudades[2] = "Nueva York";
        ciudades[3] = "Buenos Aires";
        ciudades[4] = "Asunción";
        ciudades[5] = "São Paulo";
        ciudades[6] = "Lima";
        ciudades[7] = "Santiago de Chile";
        ciudades[8] = "Lisboa";
        ciudades[9] = "Tokio";

        double[][] temperatura = new double[10][2];

        temperatura[0][0] = -2;
        temperatura[0][1] = 33;
        temperatura[1][0] = -3;
        temperatura[1][1] = 32;
        temperatura[2][0] = -8;
        temperatura[2][1] = 27;
        temperatura[3][0] = 4;
        temperatura[3][1] = 37;
        temperatura[4][0] = 6;
        temperatura[4][1] = 42;
        temperatura[5][0] = 0;
        temperatura[5][1] = 39;
        temperatura[6][0] = -7;
        temperatura[6][1] = 26;
        temperatura[7][0] = -1;
        temperatura[7][1] = 31;
        temperatura[8][0] = -10;
        temperatura[8][1] = 35;
        temperatura[9][0] = 1;  // Añadir valores para la fila 9
        temperatura[9][1] = 2;  // Añadir valores para la fila 9

        String ciudadTemperaturaMax = " ";
        String ciudadTemperaturaMin = " ";

        double temperaturaMax = 0;
        double temperaturaMin = 0;

        for (int i = 0; i < temperatura.length; i++) {
            if (temperatura[i][0] > temperaturaMin ) {
                temperaturaMin = temperatura[i][0];
                ciudadTemperaturaMin = ciudades[i];

            } if (temperatura[i][0] < temperaturaMax) {
                temperaturaMax =temperatura[i][0];
                ciudadTemperaturaMax = ciudades[i];
            }

        }

        System.out.println("la temperatura minima es de " + temperaturaMin + " en la ciudad de:"+ ciudadTemperaturaMin);
        System.out.println("la temperatura minima es de "+ temperaturaMax + " en la ciudad de:" + ciudadTemperaturaMax);


    }


}