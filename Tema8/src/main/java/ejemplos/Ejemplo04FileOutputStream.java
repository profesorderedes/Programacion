package ejemplos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejemplo04FileOutputStream {

	public static void main(String[] args) {

		copiar("ficheros/marte.jpg", "ficheros/marte2.jpg");

	}

	private static void copiar(String nombreArchivoOrigen, String nombreArchivoDestino) {

		try {

			// Abrimos el archivo de origen para lectura.
			FileInputStream archivoOrigen = new FileInputStream(nombreArchivoOrigen);

			// Abrimos el archivo de destino para escritura.
			FileOutputStream archivoDestino = new FileOutputStream(nombreArchivoDestino);

			// Leemos el primer byte.
			int byteLeido = archivoOrigen.read();

			// Iremos leyendo cada byte del archivo de origen hasta que el byte leído sea
			// -1.
			while (byteLeido != -1) {

				// Guardamos el byte recién leído en el archivo de destino.
				archivoDestino.write(byteLeido);
				byteLeido = archivoOrigen.read();

			}

			// Cerramos los dos archivos.
			archivoOrigen.close();
			archivoDestino.close();

		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado.");
		} catch (IOException e) {
			System.out.println("Error leyendo el archivo.");
		}

	}
}
