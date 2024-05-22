package org.example.poo.practicaPersonas;

public class Main {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("12345678A", "Juan", 30, 80, 180);
    }
}

//¿Qué pasa si uso cualquier método get en un objeto vacío?
//Obtendrás el valor predeterminado para el tipo de dato del atributo.
// Por ejemplo, para un String será null, para un int será 0, para un double será 0.0, etc.

//¿Qué sucede si uso cualquier método set sobre un atributo del objeto vacío?
//Establecerás el valor del atributo en el valor proporcionado.

//¿Qué pasa si uso cualquier método get en un objeto con valores (creado con el constructor por parámetros)?
//Obtendrás el valor actual del atributo según fue establecido durante la creación del objeto.

//¿Qué sucede si uso cualquier método set sobre un atributo del objeto que ya tiene valores?
//Cambiarás el valor del atributo al nuevo valor proporcionado.