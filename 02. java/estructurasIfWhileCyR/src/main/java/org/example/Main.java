package org.example;

public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        estructurasSelectivas selectivas = new estructurasSelectivas();
        System.out.println("Valor de a " + a + " y b " + b);

        System.out.println("\nEstructuras Selectivas \n");
        System.out.println("Sentencia If");
        selectivas.ifElse(a,b);
        System.out.println("\nSentencia Switch");
        selectivas.switchCase(a);
        System.out.println("\nSentencia Otro Switch");
        selectivas.otherSwitchCase(a);
        System.out.println("\nSentencia Switch con Yield");
        System.out.println(selectivas.switchWithYield("Lunes"));

        estructurasRepetitivas repetitivas = new estructurasRepetitivas();

        System.out.println("\nEstructuras Repetitivas \n");
        System.out.println("Sentencia Do While");
        repetitivas.doWhileLoop(a);
        System.out.println("\nSentencia While");
        repetitivas.whileLoop(a);
        System.out.println("\nSentencia For");
        repetitivas.forLoop(a);


    }
}