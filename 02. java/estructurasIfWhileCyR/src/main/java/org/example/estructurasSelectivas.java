package org.example;

public class estructurasSelectivas {

    private int a;
    private int b;

    public void ifElse(int a, int b) {

        if (a > b) {
            System.out.println("a es mayor que b");
        }  else if (a < b) {
            System.out.println("a es menor que b");
        } else {
            System.out.println("a es igual que b");
        }
    }


    public void switchCase(int a) {

        switch (a) {
            case 10:
                System.out.println("a es igual a 10");
                break;
            case 20:
                System.out.println("a es igual a 20");
                break;
            case 30:
                System.out.println("a es igual a 30");
                break;
            default:
                System.out.println("a no es igual a 10, 20 o 30");
        }
    }

    public void otherSwitchCase(int a) {

        switch (a) {
            case 0 -> System.out.println("a es igual a 0");
            case 10 -> {
                System.out.println("a es igual a 10");
                System.out.println("Y se puede hacer esto en el nuevo switch");
            }
            case 20 -> System.out.println("a es igual a 20");
            case 50 ->  System.out.println("a es igual a 50");
            default -> System.out.println("a no es igual a 0, 10, 20 o 50");
        }
    }

    public String switchWithYield(String dayOfWeek) {
        return switch (dayOfWeek) {
            case "Lunes", "Martes", "Miercoles", "Jueves", "Viernes" -> {
                yield "Es día laboral";
            }
            case "Sabado", "Domigo" -> {
                yield "Es fin de semana";
            }
            default -> throw new IllegalArgumentException("Día de la semana inválido");
        };
    }

}
