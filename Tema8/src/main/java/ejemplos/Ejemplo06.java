package ejemplos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo06 {

	public static void main(String[] args) {

		leer("src/main/java/ejemplos/Ejemplo06.java");

	}

	private static void leer(String ruta) {

		try {
			FileReader archivo = new FileReader(ruta);
			BufferedReader buffer = new BufferedReader(archivo);

			String linea = buffer.readLine();
			while (linea != null) {
				System.out.println(linea);
				linea = buffer.readLine();
			}

			buffer.close();

		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado.");
		} catch (IOException e) {
			System.out.println("Error al leer del archivo.");
		}

	}

}
