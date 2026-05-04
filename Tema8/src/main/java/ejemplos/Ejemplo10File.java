package ejemplos;

import java.io.File;

public class Ejemplo10File {

	public static void main(String[] args) {

		// Crear directorios anidados de una sola vez.

		File carpeta = new File("configuracion/app/tests/loquesea");

		carpeta.mkdirs();

		// Borrar un fichero o directorio.

		carpeta.delete(); // Borra la carpeta "loquesea"
		
	}

}
