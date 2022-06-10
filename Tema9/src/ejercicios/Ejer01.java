package ejercicios;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("***** COPIA DE ARCHIVOS *****");
		System.out.println("Nombre del archivo a copiar:");
		String nombreOriginal = entrada.nextLine();

		String nombreCopia = nuevoNombre(nombreOriginal);

		// Abrimos el archivo para lectura y el archivo de
		// copia para escritura.
		try {

			// Abrimos el archivo original para lectura.
			FileInputStream archivoOriginal = new FileInputStream("ficheros/" + nombreOriginal);
			BufferedInputStream bufferOriginal = new BufferedInputStream(archivoOriginal);

			// Abrimos el archivo de copia para escritura.
			FileOutputStream archivoCopia = new FileOutputStream("ficheros/" + nombreCopia);
			BufferedOutputStream bufferCopia = new BufferedOutputStream(archivoCopia);

			// Vamos leyendo el archivo original byte a byte
			// y guardando cada byte en el archivo copia.
			int byteLeido = bufferOriginal.read();

			while (byteLeido != -1) {
				bufferCopia.write(byteLeido);
				byteLeido = bufferOriginal.read();
			}

			// Cerramos los buffers.
			bufferOriginal.close();
			bufferCopia.close();

			System.out.println("Copia terminada.");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static String nuevoNombre(String cadena) {

		int posExtension = cadena.lastIndexOf(".");

		String nombre = cadena.substring(0, posExtension);
		String extension = cadena.substring(posExtension);

		return nombre + ".copia" + extension;

	}

}
