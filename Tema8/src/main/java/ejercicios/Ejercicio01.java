package ejercicios;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Indique el nombre del archivo binario del que quiere hacer una copia.");
		String archivo = entrada.nextLine();

		if (copiarArchivo(archivo)) {
			System.out.println("Se ha copiado correctamente el archivo " + archivo);
		}

	}

	private static boolean copiarArchivo(String archivo) {

		try {
			BufferedInputStream original = new BufferedInputStream(new FileInputStream("ficheros/" + archivo));

			String nombreNuevo = anyadirCopia(archivo);
			BufferedOutputStream copia = new BufferedOutputStream(new FileOutputStream("ficheros/" + nombreNuevo));

			int byteLeido = original.read();

			while (byteLeido != -1) {
				copia.write(byteLeido);
				byteLeido = original.read();
			}

			original.close();
			copia.close();

			return true;

		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado.");
		} catch (IOException e) {
			System.out.println("Error al realizar copia del archivo.");
		}

		return false;

	}

	private static String anyadirCopia(String original) {

		int posPunto = original.lastIndexOf(".");

		String nombre = original.substring(0, posPunto);
		String extension = original.substring(posPunto, original.length());

		return nombre + ".copia" + extension;
	}

}