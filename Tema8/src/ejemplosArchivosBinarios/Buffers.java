package ejemplosArchivosBinarios;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Buffers {
	private static String archivo = "ficheros/numeros.dat";

	public static void main(String[] args) {
		
// Escribimos los números del 1 al 50 en un archivo de disco.
		escribir();
// Leemos el contenido del anterior archivo y lo mostramos en la
// consola.
		leer();
	}

	public static void escribir() {
		try {
			FileOutputStream fichero = new FileOutputStream(archivo);
			BufferedOutputStream buffer = new BufferedOutputStream(fichero);
			for (int i = 65; i <= 90; i++) {
				buffer.write(i);
			}
			buffer.close();
		} catch (IOException e) {
			System.out.println("Error: " + e.toString());
		}
	}

	public static void leer() {
		try {
			FileInputStream fichero = new FileInputStream(archivo);
			BufferedInputStream buffer = new BufferedInputStream(fichero);
			int byteLeido = buffer.read();
			while (byteLeido != -1) {
				System.out.println(byteLeido + " ");
				byteLeido = buffer.read();
			}
			buffer.close();
		} catch (IOException e) {
			System.out.println("Error: " + e.toString());
		}
	}
}