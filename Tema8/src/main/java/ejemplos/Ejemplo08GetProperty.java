package ejemplos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo08GetProperty {

	public static void main(String[] args) {

		String carpetaUsuario = System.getProperty("user.home");
		System.out.println("Carpeta de usuario: " + carpetaUsuario);

		String carpetaActual = System.getProperty("user.dir");
		System.out.println("Ruta actual: " + carpetaActual);

		// Creamos un archivo en la carpeta del usuario y escribimos cualquier cosa en
		// él.

		try {

			BufferedWriter buffer = new BufferedWriter(new FileWriter(carpetaUsuario + "/nuevo.txt"));

			buffer.write("Aquí estuvo Carlos.");

			System.out.println("Archivo creado.");

			buffer.close();

		} catch (IOException e) {
			System.out.println("Error al escribir el archivo.");
		}

	}

}
