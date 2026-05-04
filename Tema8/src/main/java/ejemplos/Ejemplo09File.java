package ejemplos;

import java.io.File;

public class Ejemplo09File {

	public static void main(String[] args) {

		// Crear una carpeta en nuestro proyecto de Eclipse
		File carpeta = new File("configuracion");
		boolean carpetaCreada = carpeta.mkdir();

		if (carpetaCreada) {
			System.out.println("Se ha creado esta carpeta: " + carpeta.getAbsolutePath());
		} else {
			System.out.println("No se ha podido crear esta carpeta: " + carpeta.getAbsolutePath());
		}

		// Crear una carpeta en la carpeta personal del usuario.
		File carpeta2 = new File(System.getProperty("user.home") + "/configuracion");
		carpetaCreada = carpeta2.mkdir();

		if (carpetaCreada) {
			System.out.println("Se ha creado esta carpeta: " + carpeta2.getAbsolutePath());
		} else {
			System.out.println("No se ha podido crear esta carpeta: " + carpeta2.getAbsolutePath());
		}
	}

}
