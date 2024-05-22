package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //declaro o creo la clase
        class Persona {
            Integer dni;
            String nombre;
            Integer edad;
            Double peso;
            Double altura;

            // constructor vacio
            public Persona() {

            }

            //creo constructor con atributos
            public Persona(Integer dni, String nombre, Integer edad, Double peso, Double altura) {
                this.dni = dni;
                this.nombre = nombre;
                this.edad = edad;
                this.peso = peso;
                this.altura = altura;
            }

            //Métodos get y set

            public Integer getDni() {
                return dni;
            }

            public String getNombre() {
                return nombre;
            }

            public Integer getEdad() {
                return edad;
            }

            public Double getPeso() {
                return peso;
            }

            public Double getAltura() {
                return altura;
            }

            public void setDni(Integer dni) {
                this.dni = dni;
            }

            public void setNombre(String nombre) {
                this.nombre = nombre;
            }

            public void setEdad(Integer edad) {
                this.edad = edad;
            }

            public void setPeso(Double peso) {
                this.peso = peso;
            }

            public void setAltura(Double altura) {
                this.altura = altura;
            }
        };

        // instancio, creo persona con objeto vacío
        Persona personaVacia = new Persona();

        // 1- Usar método GET en un objeto vacío, devuelve null
        System.out.println("Uso método GET en un objeto vacío, en nombre devuelve: "+ personaVacia.getNombre());
        System.out.println("Uso método GET en un objeto vacío, en DNI devuelve: "+ personaVacia.getDni());

        // 2- Usar el metodo SET y se le termina asignando ese valor al atributo
        personaVacia.setNombre("María");
        System.out.println("Uso método SET en objeto vacío, muestra: " + personaVacia.getNombre());


        //instancio con constructor con parámetros
        Persona personaConDato = new Persona(98765432, "Juan", 28, 80.500, 1.80);
        //3- get en objeto con valores
        System.out.println("Método get en objeto con valor, muestra: " + personaConDato.getNombre());

        // 4-Método set en un objeto con valores asignados.
        personaConDato.setNombre("Pedro");
        System.out.println("Aplico método set en un objeto con valor, en nombre era Juan, ahora es: " + personaConDato.getNombre());
    }
};
