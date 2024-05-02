/*
Se desea realizar una aplicación para una biblioteca que posee, para el uso de las personas
que asisten a ella, libros, revistas y mapas.
Tanto libros, revistas y mapas son considerados como artículos de la biblioteca y tienen
los siguientes atributos en común: código, nombre y año de publicación.
Los libros tienen los atributos propios autor y prestado, donde éste último indica si ese
libro fue prestado o no (boolean). Las revistas, por su parte, tienen como atributos propios el
número de edición y el mes. Los mapas, por otro lado, tienen como atributos tipoMapa y tamanio.
La biblioteca dejó en claro que por el momento SOLO LOS LIBROS pueden ser prestados fuera de la biblioteca.
Sin embargo, no niega que a futuro puedan existir otros artículos que se presten, por lo que, para prevenir
trabajo extra de diseño y modelado cuando esto suceda, se recomienda la creación de una interfaz
llamada Prestable que cuente con los métodos prestar() y devolver(). La clase libro debe implementar
esta interface. Por otro lado, tanto mapas como revistas no pueden ser prestados fuera de la biblioteca
y de igual manera, a futuro puede que se implementen nuevos artículos con esta particularidad,
por lo que, se recomienda la creación de una interfaz llamada NoPrestable que contenga los métodos:
utilizarEnBiblioteca(), devolverEnBiblioteca(). Ambas clases (mapas y revistas) deben implementar esta interfaz.
Una vez finalizado el modelado necesario realizar lo siguiente:
Crear un libro, un mapa y una revista y mostrar por pantalla sus atributos.
Tomar el libro y llamar al método prestar.
Tomar el mapa y llamar al método utilizarEnBiblioteca().
Tomar la revista creada y llamar al método devolverEnBiblioteca().
*/
package org.example.clasesEInterfaces.biblioteca;

public class Main {
    public static void main(String[] args) {
        //NO SE PUEDE INSTANCIAR ARTICULO (ES ABSTRACTA!!)
        Libro libro = new Libro("L1", "El Principito", 1943, "Antoine de Saint-Exupéry");
        System.out.println("Libro:");
        System.out.println(libro.procedencia()); //no sale nada porque no le puse nada
        System.out.println(libro.prestar());

        Revista revista = new Revista("R1", "National Geographic", 2024, 4, "Abril");
        System.out.println("\nRevista:");
        System.out.println(revista.procedencia()); //no sale nada porque no le puse nada
        System.out.println(revista.devolverEnBiblioteca());

        Mapa mapa = new Mapa("M1", "De la Ciudad", 2020, "Callejero", "A2");
        System.out.println("\nMapa:");
        System.out.println(mapa.procedencia()); //no sale nada porque no le puse nada
        System.out.println(mapa.utilizarEnBiblioteca());
    }
}