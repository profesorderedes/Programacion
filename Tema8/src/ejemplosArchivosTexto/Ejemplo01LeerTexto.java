package ejemplosArchivosTexto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo01LeerTexto {

	public static void main(String[] args) {

		final String NOMBRE_ARCHIVO = "ficheros/apuntes.txt";

		leer(NOMBRE_ARCHIVO);
	}

	private static void leer(String nombreArchivo) {

		try {
			FileReader archivo = new FileReader(nombreArchivo);
			BufferedReader buffer = new BufferedReader(archivo);

			String linea = buffer.readLine();
			while (linea != null) {
				System.out.println(linea);
				linea = buffer.readLine();
			}

			buffer.close();

		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error al leer el archivo.");
			e.printStackTrace();
		}

	}
}
