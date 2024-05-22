/*
Un estudiante de programación estuvo investigando cómo se lleva a cabo
la lectura y apertura de archivos de texto en Java. Al diseñar el siguiente método
no tuvo en cuenta los posibles errores que pueden suceder, por lo que se necesita
aplicar un manejo de excepciones adecuado.

String nombreArchivo = “archivo.txt”;
	String texto = null;
	BufferedReader bufferedReader = new BufferedReader(new FileReader(nombreArchivo));
	while((texto = bufferedReader.readLine()) != null) {
		System.out.println(texto);
	}
	bufferedReader.close();

El código presentado puede arrojar las siguientes excepciones:
FileNotFoundException (porque el archivo NO EXISTE) e IOException
(porque no tenemos ningún archivo para ingresar datos de entrada y leerlos).
Se solicita:

Manejar el caso de que no se encuentre el archivo mediante la excepción de tipo
FileNotFoundException en el método, en caso de ser lanzada se pide que muestre por
consola el siguiente mensaje: “No se puede encontrar el archivo especificado”.
A la hora de tratar con el contenido del archivo, manejar la excepción de tipo
IOException que se haya encontrado en el método, en caso de ser lanzada se solicita
que se muestre por consola el siguiente mensaje: “Error al leer el archivo especificado”.

 */

package org.example.excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Archivo {
    public static void main(String[] args) {
        String nombreArchivo = "archivo.txt";
        String texto = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(nombreArchivo));
            while ((texto = bufferedReader.readLine()) != null) {
                System.out.println(texto);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se puede encontrar el archivo especificado");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo especificado");
        }
    }
}