package ejemplos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Ejemplo01FileInputStream {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("VISOR DE ARCHIVOS");

		while (true) {
			System.out.println("\n¿Qué archivo quiere abrir?");
			String nombreArchivo = entrada.nextLine();

			leerArchivo(nombreArchivo);
		}

	}

	private static void leerArchivo(String nombreArchivo) {

		try {

			FileInputStream archivo = new FileInputStream("ficheros/" + nombreArchivo);

			// Leemos los 20 primeros bytes del archivo para identificar el tipo de archivo.

			int byteLeido;
			for (int i = 0; i < 20; i++) {

				byteLeido = archivo.read();
				System.out.print(Integer.toHexString(byteLeido));

			}

			System.out.println();

			archivo.close();

		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el archivo.");
		} catch (IOException e) {
			System.out.println("Error leyendo el archivo.");
		}

	}

	//@formatter:off
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//@formatter:on

}
