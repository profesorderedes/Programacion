package ejercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejer04 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// Pedimos los datos de la página.
		System.out.print("Título de la página: ");
		String titulo = entrada.nextLine();
		
		
		try {
			// Abrimos el archivo para escritura.
			BufferedWriter buffer = new BufferedWriter(
					new FileWriter("ficheros/index.html"));
			
			buffer.write("<!DOCTYPE html>\n");
			buffer.write("<html>\n");
			buffer.write("<head>\n");
			buffer.write("<title>" + titulo + "</title>\n");
			
			buffer.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
