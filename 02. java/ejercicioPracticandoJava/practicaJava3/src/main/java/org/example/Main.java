package org.example;

import javax.swing.text.Element;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        class  Animal{
            String nombreMascota;
            String especie;
            String raza;
            Integer edad;
            String igDuenio;

            public Animal(String nombreMascota, String especie, String raza, Integer edad, String igDuenio) {
                this.nombreMascota = nombreMascota;
                this.especie = especie;
                this.raza = raza;
                this.edad = edad;
                this.igDuenio = igDuenio;
            }

            public String getNombreMascota() {
                return nombreMascota;
            }

            public String getEspecie() {
                return especie;
            }

            public String getRaza() {
                return raza;
            }

            public Integer getEdad() {
                return edad;
            }

            public String getIgDuenio() {
                return igDuenio;
            }

            public void setNombreMascota(String nombreMascota) {
                this.nombreMascota = nombreMascota;
            }

            public void setEspecie(String especie) {
                this.especie = especie;
            }

            public void setRaza(String raza) {
                this.raza = raza;
            }

            public void setEdad(Integer edad) {
                this.edad = edad;
            }

            public void setIgDuenio(String igDuenio) {
                this.igDuenio = igDuenio;
            }
        };

        Animal[] animales = new Animal[10];
        animales[0] = new Animal("Lulu", "gato", "Asiatico", 2, "@alu96instagram");
        animales[1] = new Animal("boro", "gato", "americano", 3, "@juan63instagram");
        animales[2] = new Animal("roco", "perro", "gran danes", 1, "@lucas23instagram");
        animales[3] = new Animal("cromo", "gato", "Asiatico", 5, "@afrankiinstagram");
        animales[4] = new Animal("almendra", "perro", "boxer", 4, "@david777instagram");
        animales[5] = new Animal("africa", "perro", "labrador", 2, "@mari33instagram");
        animales[6] = new Animal("osi", "tortuga", "Asiatico", 3, "@lean96instagram");
        animales[7] = new Animal("ciro", "perro", "bull terrier", 1, "@cami333instagram");
        animales[8] = new Animal("luna", "ave", "Asiático", 5, "@andru988instagram");
        animales[9] = new Animal("mostaza", "gato", "Balinés", 2, "@alu9689instagram");

        Integer perroPremio = 0;
        Integer gatoPremio = 0;
        Integer otroPremio = 0;

        for (int i = 0; i < animales.length; i++) {
            if (animales[i].especie.equals("perro")) {
                perroPremio++;
            } else if (animales[i].especie.equals("gato")) {
                gatoPremio++;
            } else {
                otroPremio++;
            }
        }

        System.out.println("perros ganadores: " + perroPremio);
        System.out.println("gatos ganadores: " + gatoPremio);
        System.out.println("otros ganadores: " + otroPremio);
    }
}