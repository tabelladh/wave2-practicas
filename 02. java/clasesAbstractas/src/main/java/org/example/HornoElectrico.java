package org.example;

 public class HornoElectrico extends Electrodomestico {
     private int temperaturaMaxima;
     private boolean poseeGrill;
     private boolean poseeAutolimpieza;

     // Constructor
     public HornoElectrico(String codigo, String nombre, String marca, String modelo, String descripcion,
                           int cantidad, double precioCosto, double precioVenta, int temperaturaMaxima,
                           boolean poseeGrill, boolean poseeAutolimpieza) {
         this.codigo = codigo;
         this.nombre = nombre;
         this.marca = marca;
         this.modelo = modelo;
         this.descripcion = descripcion;
         this.cantidad = cantidad;
         this.precioCosto = precioCosto;
         this.precioVenta = precioVenta;
         this.temperaturaMaxima = temperaturaMaxima;
         this.poseeGrill = poseeGrill;
         this.poseeAutolimpieza = poseeAutolimpieza;
     }

     // Métodos
     @Override
     public String aumentarStock() {
         return "Aumentando stock de Horno Eléctrico";
     }

     @Override
     public String descontarStock() {
         return "Descontando stock de Horno Eléctrico";
     }

     @Override
     public String vender() {

         return "Vendiendo Horno Eléctrico";
     }
 }
