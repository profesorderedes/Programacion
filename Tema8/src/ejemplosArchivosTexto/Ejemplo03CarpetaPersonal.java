package ejemplosArchivosTexto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo03CarpetaPersonal {

	public static void main(String[] args) {

		String rutaCarpetaPersonal = System.getProperty("user.home");

		System.out.println("Ruta de nuestra carpeta personal:");
		System.out.println(rutaCarpetaPersonal);

		FileWriter archivo;
		try {
			archivo = new FileWriter(rutaCarpetaPersonal + "/minombre.txt");
			BufferedWriter buffer = new BufferedWriter(archivo);

			buffer.write("Ordenador de Carlos.");

			buffer.close();

		} catch (IOException e) {
			System.out.println("Error al escribir en el archivo.");
			e.printStackTrace();
		}

	}

}
