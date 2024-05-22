package org.example;
public class Main {
    public static void main(String[] args) {
        Categoria categoria1 = new Categoria(1,"Circuito chico","2 km por selva y arroyos");
        Categoria categoria2 = new Categoria(2,"Circuito medio","5 km por selva, arroyos y barro");
        Categoria categoria3 = new Categoria(3,"Circuito avanzado","10 km por selva, arroyos, barro y escalada en piedra.");

        Persona persona1= new Persona(7, 40123456, "juanita", "Rodriguez",26, "3492445566", "3492336644", "0+");
        Persona persona2= new Persona(8, 54667765, "Pedro", "Martinez",9, "3492445588", "3492332332", "A+");

        Inscripcion inscripcion1= new Inscripcion(23, categoria2, persona1);
        Inscripcion inscripcion2= new Inscripcion(24, categoria1, persona2);

        System.out.println(inscripcion1); //mayor con categoria 2
        System.out.println(inscripcion2); //menor con categoria 1
    }
}