package org.example;


    public class Mascota {
        String nombre;
        String especie;
        String raza;
        int edad;
        String instagram_duenio;

        public Mascota() {

        }

        public Mascota(String nombre, String especie, String raza, int edad, String instagram_duenio) {
            this.nombre = nombre;
            this.especie = especie;
            this.raza = raza;
            this.edad = edad;
            this.instagram_duenio = instagram_duenio;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getEspecie() {
            return especie;
        }

        public void setEspecie(String especie) {
            this.especie = especie;
        }

        public String getRaza() {
            return raza;
        }

        public void setRaza(String raza) {
            this.raza = raza;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getInstagram_duenio() {
            return instagram_duenio;
        }

        public void setInstagram_duenio(String instagram_duenio) {
            this.instagram_duenio = instagram_duenio;
        }

        public static void main(String[] args) {
            Mascota[] mascotas = new Mascota[10];
            mascotas[0] = new Mascota("Limon", "perro", "cruza", 2, "Joako35");
            mascotas[1] = new Mascota("Luna", "gato", "siames", 1, "Luna123");
            mascotas[2] = new Mascota("Sol", "gato", "cruza", 3, "Sol123");
            mascotas[3] = new Mascota("Pipo", "loro", "rojo", 1, "Papu24");
            mascotas[4] = new Mascota("Pom", "perro", "San Bernardo", 5, "jonaGG");
            mascotas[5] = new Mascota("Pulgarcito", "gamster", "tricol", 2, "JorgeNazis");
            mascotas[6] = new Mascota("Goku", "perro", "labrador", 7, "Agus1998");
            mascotas[7] = new Mascota("Matrix", "gato", "black", 4, "SantiagoSN");
            mascotas[8] = new Mascota("Polito", "loro", "verde", 3, "Nico2000");
            mascotas[9] = new Mascota("Tutan", "perro", "dogo", 3, "MarcosCAI");

            int perros = 0;
            int gatos = 0;
            int otros = 0;
            for (int i = 0; i < mascotas.length; i++) {
                if (mascotas[i].getEspecie() == "perro") {
                    perros++;
                } else if (mascotas[i].getEspecie() == "gato") {
                    gatos++;
                } else {
                    otros++;
                }

            }
            System.out.println("Hay " + perros + " perros ganadores");
            System.out.println("Hay " + gatos + " gatos ganadores");
            System.out.println("Hay " + otros + " ganadores de otra especie");
        }
    }
