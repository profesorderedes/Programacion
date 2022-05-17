package ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejer05 {
 
    public static void main(String[] args) {
         
        Scanner entrada = new Scanner (System.in);
         
        System.out.println("Nombre del archivo?");
        String nombre = entrada.nextLine();
         
        System.out.println("¿Qué palabra quieres buscar?");
        String palabra = entrada.nextLine();
        
        try {
            BufferedReader bufferL = new BufferedReader(
            		new FileReader("src/ejercicios/" + nombre));
             
            String linea = bufferL.readLine();
            
            int contadorPalabra = 0;
             
            while (linea != null) {
                if (linea.contains(palabra)) {
                    contadorPalabra ++;
                }
                linea = bufferL.readLine();
            }
            
            bufferL.close();
             
            System.out.println("Hay "+ contadorPalabra +" coincidencias con la palabra "+ palabra);
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el fichero");
        } catch (IOException e) {
            e.printStackTrace();
        }
         
    }
    
} 