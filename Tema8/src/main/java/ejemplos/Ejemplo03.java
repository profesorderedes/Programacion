package ejemplos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejemplo03 {

	public static void main(String[] args) {

		guardarArchivo("ficheros/nuevo.txt");

	}

	private static void guardarArchivo(String nombreArchivo) {

		try {
			FileOutputStream archivo = new FileOutputStream(nombreArchivo);

			// Guardamos en el archivo los bytes que representan los códigos ASCII de
			// las letras H O L A.
			archivo.write(72);
			archivo.write(79);
			archivo.write(76);
			archivo.write(65);

			archivo.close();

		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado.");
		} catch (IOException e) {
			System.out.println("Error al guardar en el archivo.");
		}

	}
}
