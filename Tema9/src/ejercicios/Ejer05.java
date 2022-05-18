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
        
        int contadorBreak = 0, contadorCase = 0;
        
        try {
            BufferedReader bufferL = new BufferedReader(
            		new FileReader("src/ejercicios/" + nombre));
             
            String linea = bufferL.readLine();
             
            while (linea != null) {
            	contadorBreak = contadorBreak 
            			+ contarPalabras(linea, "break");
            	contadorCase = contadorCase
            			+ contarPalabras(linea, "case");
            	
                linea = bufferL.readLine(); 
            }
           
            
            bufferL.close();
             
            
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el fichero");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println("Nº de breaks = " + contadorBreak);
        System.out.println("Nº de cases = " + contadorCase);
        
        if(contadorBreak < contadorCase) {
        	System.out.println("Advertencia: el número de break "
        			+ "es inferior al de case.");
        }else {
        	System.out.println("Parece correcto.");
        }
        
    }
    
    private static int contarPalabras(String linea, String palabra) {
    	
    	int repeticiones = 0;
    	
    	// Primera aparición
    	int pos = linea.indexOf(palabra);
    	
    	// Seguimos buscando mientras no obtengamos -1
    	while(pos != -1) {
    		repeticiones++;
    		pos = linea.indexOf(palabra, pos + 1);	
    	}
    	
    	return repeticiones;
    	
    }
    
    
    
    
    
    
    
    
    
    
    
} 