package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                HornoElectrico horno = new HornoElectrico(1, "Horno Eléctrico", "LG",
                        "Model-X1", "Horno con grill y autolimpieza",
                        5, 120, 200, 300, true, true);

                PavaElectrica pava = new PavaElectrica(2, "Pava Eléctrica", "Philips", "Model-P1",
                        "Pava eléctrica con regulador",
                        10, 50, 100, 100, true);

                Microondas microondas = new Microondas(3, "Microondas", "Samsung",
                        "Model-M1", "Microondas compacto con bandeja",
                        8, 80, 150, "Mediano", true);

                System.out.println(horno);
                System.out.println(pava);
                System.out.println(microondas);

                horno.vender();
                pava.vender();
                microondas.vender();
            }
        }
