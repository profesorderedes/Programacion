package ejemplosArchivosTexto;

import java.io.File;

public class Ejemplo04File {

	public static void main(String[] args) {

		// Creación de una carpeta

		File configuracion = new File("ficheros/configuracion");

		boolean carpetaCreada = configuracion.mkdir();

		if (carpetaCreada) {
			System.out.println("Se ha creado la carpeta.");
		} else {
			System.out.println("No se ha creado la carpeta.");
		}

		// Creación de una ruta de varias carpetas.

		File carpetas = new File("ficheros/aplicacion/configuracion/documentos/xml");

		boolean carpetasCreadas = carpetas.mkdirs();

		if (carpetasCreadas) {
			System.out.println("Se han creado las carpetas.");
		} else {
			System.out.println("No se han creado las carpetas.");
		}

	}

}
