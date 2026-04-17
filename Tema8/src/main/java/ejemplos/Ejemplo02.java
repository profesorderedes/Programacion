package ejemplos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Ejemplo02 {

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

			int byteLeido = archivo.read();
			System.out.print(byteLeido + " ");

			// Usamos esta variable para mostrar 10 bytes en cada fila.
			int bytesPorFila = 1;

			while (byteLeido != -1) {

				byteLeido = archivo.read();
				System.out.print(byteLeido + " ");

				if (bytesPorFila == 10) {
					System.out.println();
					bytesPorFila = 1;
				} else {
					bytesPorFila++;
				}

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
