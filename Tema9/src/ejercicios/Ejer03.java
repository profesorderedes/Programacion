package ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejer03 {
	
	public static void main(String[] args) {
		
		try {
			BufferedReader buffer = new BufferedReader(
					new FileReader("ficheros/contactos.txt"));
			
			String linea = buffer.readLine();
			String campos[];
			
			while(linea!= null) {
				
				campos = linea.split(",");
				
				System.out.println("Apellidos: " + campos[0]);
				System.out.println("Nombre: " + campos[1]);
				System.out.println("Teléfono: " + campos[2]);
				
				
				linea = buffer.readLine();
				if(linea != null) {
					System.out.println("------");
				}
				
			}
			
			buffer.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
