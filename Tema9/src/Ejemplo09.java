import java.io.File;

public class Ejemplo09 {

	public static void main(String[] args) {

		// Borrar el archivo "ficheros/index.html".
		File ruta = new File("ficheros/index.html");

		ruta.delete();

		// Renombrar contactos.txt -> agenda.txt
		File archivoOriginal = new File("ficheros/contactos.txt");
		File archivoNuevo = new File("ficheros/agenda.txt");

		archivoOriginal.renameTo(archivoNuevo);

	}

}
