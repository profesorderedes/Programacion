package ejemplos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo07BufferedWriter {

	public static void main(String[] args) {

		escribir("ficheros/escribir.txt");

	}

	private static void escribir(String ruta) {

		try {
			FileWriter archivo = new FileWriter(ruta, true);
			BufferedWriter buffer = new BufferedWriter(archivo);

			buffer.write("Me llamo Carlos.\n");
			buffer.write("Este texto lo escribimos usando Java.\n");

			buffer.close();

		} catch (IOException e) {
			System.out.println("Error al guardar en el disco.");
		}

	}
}
