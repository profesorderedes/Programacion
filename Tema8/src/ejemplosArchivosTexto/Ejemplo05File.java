package ejemplosArchivosTexto;

import java.io.File;

public class Ejemplo05File {

	public static void main(String[] args) {

		// Borrar un archivo o carpeta.

		File numeros = new File("ficheros/numeros.dat");

		boolean eliminado = numeros.delete();

		if (eliminado) {
			System.out.println("Se ha eliminado el archivo.");
		} else {
			System.out.println("No se ha eliminado el archivo.");
		}

		File aplicacion = new File("ficheros/aplicacion");

		eliminado = aplicacion.delete();

		if (eliminado) {
			System.out.println("Se ha eliminado la carpeta.");
		} else {
			System.out.println("No se ha eliminado la carpeta.");
		}

	}

}
