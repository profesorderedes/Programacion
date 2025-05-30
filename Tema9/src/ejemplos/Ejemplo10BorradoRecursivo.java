package ejemplos;

import java.io.File;

public class Ejemplo10BorradoRecursivo {

	public static void main(String[] args) {

		File eclipse = new File("/home/csogorb/eclipseborrar");
		
		borrar(eclipse);
		
	}

	/**
	 * Borra el archivo o carpeta que se le pase como parámetro.
	 * 
	 * @param archivo Objeto File que representa una carpeta o archivo que se quiere
	 *                borrar.
	 */
	private static void borrar(File archivo) {

		// Caso recursivo.
		// El método archivo.isDirectory() devuelve true si el objeto es una
		// carpeta.
		if (archivo.isDirectory()) {
			// El método archivo.listFiles() devuelve un array de objetos File
			// que representan los archivos y carpetas contenidos en archivo.
			for (File f : archivo.listFiles())
				borrar(f);
		}

		// Caso base.
		boolean borrado = archivo.delete();
		System.out.println("Borrado " + archivo.toString());

		if (!borrado) {
			System.out.println("ERROR AL BORRAR");
		}
	}

}
