package ejemplos;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejemplo05 {

	public static void main(String[] args) {

		copiar("ficheros/marte.jpg", "ficheros/marte2.jpg");

	}

	private static void copiar(String nombreArchivoOrigen, String nombreArchivoDestino) {

		try {

			// Abrimos el archivo de origen para lectura, usando buffers.
			FileInputStream archivoOrigen = new FileInputStream(nombreArchivoOrigen);
			BufferedInputStream bufferOrigen = new BufferedInputStream(archivoOrigen);

			// Abrimos el archivo de destino para escritura, usando buffers.
			FileOutputStream archivoDestino = new FileOutputStream(nombreArchivoDestino);
			BufferedOutputStream bufferDestino = new BufferedOutputStream(archivoDestino);

			// Leemos el primer byte
			int byteLeido = bufferOrigen.read();

			// Iremos leyendo cada byte del archivo de origen hasta que el byte leído sea
			// -1.
			while (byteLeido != -1) {

				// Guardamos el byte recién leído en el archivo de destino.
				bufferDestino.write(byteLeido);
				byteLeido = bufferOrigen.read();

			}

			// Cerramos los dos archivos.
//			bufferOrigen.close();
//			bufferDestino.close();

		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado.");
		} catch (IOException e) {
			System.out.println("Error leyendo el archivo.");
		}

	}
}
