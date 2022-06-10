import java.io.File;

public class BorradoRecursivo {

	public static void main(String[] args) {
		borrar(new File("/home/csogorb/Escritorio/prueba"));
	}

	/**
	 * Borra el archivo o carpeta que se le pase como parámetro.
	 * 
	 * @param archivo Objeto File que representa una carpeta o archivo que se quiere
	 *                borrar.
	 */
	private static void borrar(File archivo) {

		// Caso recursivo.
		// El método archivo.isDirectory() devuelve true
		// si el objeto es una carpeta.
		if (archivo.isDirectory()) {
			// El método archivo.listFiles() devuelve un array
			// de objetos File que representan los archivos
			// y carpetas contenidos en archivo.
			for (File f : archivo.listFiles())
				borrar(f);
		}

		// Caso base.
		System.out.println("Borrando " + archivo.toString());
		boolean borrado = archivo.delete();

		if (!borrado) {
			System.out.println("ERROR AL BORRAR");
		}

	}
}