import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo06 {

	public static void main(String[] args) {

		// Información que queremos guardar.
		String nombre = "charlie";
		int puntos = 10;

		try {
			// Abrimos el archivo para escritura.
			FileWriter archivo = new FileWriter("ficheros/puntuaciones.txt", true);
			BufferedWriter buffer = new BufferedWriter(archivo);

			// Guardamos el nombre del jugador y su puntuación.
			buffer.write(nombre + "\n");
			buffer.write(puntos + "\n");

			// Cerramos el archivo.
			buffer.close();

			System.out.println("Se ha guardado la puntuación.");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
