
package excepcionesarchivo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ExcepcionesArchivo {

    
    public static void main(String[] args) {
        
         /**
     * Ejercicio 3
     * @param nombreArchivo nombre del archivo
     */
         String nombreArchivo = "src\\excepcionesarchivo\\Archivo.txt";
         //Si se introduce un nombre de archivo que no existe se lanza una excepción.

         String texto = null;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(nombreArchivo));

            while((texto = bufferedReader.readLine()) != null) {
                System.out.println(texto);
            }
            bufferedReader.close();

        } catch (FileNotFoundException ex) {
            System.out.println("No se puede encontrar el archivo especificado");
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo especificado");
        }
    }
        
        
    }
    

