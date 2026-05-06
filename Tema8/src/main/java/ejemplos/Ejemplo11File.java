package ejemplos;

import java.io.File;

public class Ejemplo11File {

	public static void main(String[] args) {

		File nombreActual = new File("ficheros/escribir.txt");
		File nombreNuevo = new File("ficheros/escribir2.txt");

		boolean nombreCambiado = nombreActual.renameTo(nombreNuevo);

		if (nombreCambiado) {
			System.out.println("Se ha cambiado el nombre");
		} else {
			System.out.println("No se ha podido cambiar el nombre.");
		}

	}

}
