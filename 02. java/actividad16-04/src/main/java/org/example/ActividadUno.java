package org.example;


public class ActividadUno {
    public void getPrecio(double producto, int fabrica) {

    double viaje = 0.0;
    double ganancia = 1.25;


        switch (fabrica){
            case 1:
                viaje = 1.07;
                break;
            case 2:
                viaje = 1.15;
                break;
            case 3:
                viaje = 1.22;
                break;
            default:
                System.out.println("el numero ingresado es incorrecto");
                break;
        }
        double costo = producto * viaje;
        double precioVenta = costo * ganancia;
        System.out.println("el precio de venta del producto es: $" + String.format("$%.2f",precioVenta));

    }
}
