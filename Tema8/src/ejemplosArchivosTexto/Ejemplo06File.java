package ejemplosArchivosTexto;

import java.io.File;

public class Ejemplo06File {

	public static void main(String[] args) {

		// Renombrar un archivo o carpeta.

		File nombreAntiguo = new File("ficheros/aplicacion/configuracion/documentos/xml");

		File nombreNuevo = new File("ficheros/aplicacion/configuracion/documentos/json");

		boolean modificado = nombreAntiguo.renameTo(nombreNuevo);

		if (modificado) {
			System.out.println("Se ha renombrado el archivo.");
		} else {
			System.out.println("No se ha renombrado el archivo.");
		}
	}

}
