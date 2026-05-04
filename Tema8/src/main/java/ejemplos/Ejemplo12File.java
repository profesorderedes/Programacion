package ejemplos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo12File {

	public static void main(String[] args) {

		pasarAMayusculas("agenda_pruebas.txt");

	}

	private static void pasarAMayusculas(String archivo) {

		try {

			// Abrimos el archivo para lectura y abrimos un archivo temporal para escritura.

			BufferedReader bufferLectura = new BufferedReader(new FileReader("ficheros/" + archivo));
			BufferedWriter bufferEscritura = new BufferedWriter(new FileWriter("ficheros/temporal"));

			// Leemos una línea del archivo original y la guardamos en el otro pasada a
			// mayúsculas.

			String linea = bufferLectura.readLine();

			while (linea != null) {

				linea = linea.toUpperCase();
				bufferEscritura.write(linea + "\n");

				linea = bufferLectura.readLine();

			}

			bufferLectura.close();
			bufferEscritura.close();

		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado.");
		} catch (IOException e) {
			System.out.println("Error de entrada / salida.");
		}

		// Eliminamos el archivo original.

		File original = new File("ficheros/" + archivo);
		original.delete();

		// Renombramos el archivo temporal.

		File temp = new File("ficheros/temporal");
		temp.renameTo(original);

	}

}
