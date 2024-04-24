package org.example;

public class Main {
    public static void main(String[] args) {

        Categoria categoria1 = new Categoria(1,"Circuito chico","2 km por selva y arroyos");
        Categoria categoria2 = new Categoria(2,"Circuito medio","5 km por selva, arroyos y barro");
        Categoria categoria3 = new Categoria(3,"Circuito avanzado","10 km por selva, arroyos, barro y escalada en piedra.");

        Persona persona = new Persona(11,35637310,"matias","oggero",33,"3492507527","3492600499","a+");

        Inscripcion inscripcion = new Inscripcion(1,categoria1,persona);

    }
}