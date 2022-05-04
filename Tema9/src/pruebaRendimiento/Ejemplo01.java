package pruebaRendimiento;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Ejemplo01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		long tiempoInicial = System.currentTimeMillis();
		
		// Abrimos el archivo para lectura.
		try {
			FileInputStream archivo = 
					new FileInputStream("ficheros/cometa.jpg");

			// Leemos el primer byte.
			int byteLeido = archivo.read();

			// Vamos leyendo el archivo byte a byte.
			while (byteLeido != -1) {

				System.out.println(byteLeido);
				byteLeido = archivo.read();

			}

			// Cerramos el archivo.
			archivo.close();
			
			System.out.println("\nTiempo transcurrido: " 
			+ (System.currentTimeMillis() - tiempoInicial)
			+ " ms.");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
