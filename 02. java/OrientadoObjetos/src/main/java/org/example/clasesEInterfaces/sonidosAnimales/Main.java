/*
Se solicita la creación de una clase abstracta denominada Animal, de la cual deriven 3 animales:
Perro, Gato y Vaca. Los 3 animales son capaces de “emitir sonidos”, para ello será necesario implementar
un método que permita mostrar por pantalla el sonido que emite cada animal. Por ejemplo, en el caso del
perro “guau”, el gato “miau” y la vaca “muuu”. A partir de esto, teniendo en cuenta los gustos alimenticios
de cada animal (gato y perro son considerados carnívoros y la vaca un herbívoro), incluir las interfaces
necesarias para contemplar los métodos comerCarne o comerHierba. Una vez realizado lo mencionado, llevar a
cabo en el Main la creación de diferentes animales y la invocación de sus respectivas implementaciones de
métodos. Para implementar los métodos comerCarne y comerHierba se puede mostrar un mensaje por pantalla.
Por ejemplo: System.out.println(“Soy un perro y como carne”). Extra: Como propuesta extra se sugiere implementar
a un método comerAnimal donde a partir del pasaje de un objeto de cualquier tipo de animal como parámetro
(un perro, un gato o una vaca), invoque al método para comer según corresponda a dicho animal.
*/

package org.example.clasesEInterfaces.sonidosAnimales;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro();
        Gato gato = new Gato();
        Vaca vaca = new Vaca();

        perro.emitirSonido();
        perro.comerCarne();
        gato.emitirSonido();
        gato.comerCarne();
        vaca.emitirSonido();
        vaca.comerHierba();

        // Invocación del método comerAnimal
        Animal.comerAnimal(perro);
        Animal.comerAnimal(gato);
        Animal.comerAnimal(vaca);
    }
}
