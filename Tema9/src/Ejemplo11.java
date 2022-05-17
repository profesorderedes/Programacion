import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Escribe un programa que cree la siguiente
 * estructura de carpetas en tu carpeta personal:
 * ejemplo11
 * 	 info
 * Dentro de la carpeta info, aparecerá un archivo 
 * de texto "version.txt" con la siguiente información:

	Ejemplo11
	Autor: tu nombre
	Versión: 1.0

	Finalmente, el programa renombrará este archivo como 
	"acercade.txt".
 */
public class Ejemplo11 {
	
	public static void main(String[] args) {
		
		// Creamos la estructura de carpetas.
		
		String ruta = System.getProperty("user.home") 
				+ "/ejemplo11/info";
		File carpetas = new File(ruta);
		if(carpetas.mkdirs()) {
			System.out.println("Carpetas creadas.");
		}
		
		// Creamos el archivo version.txt con su contenido.
		
		try {
			
			BufferedWriter buffer = new BufferedWriter(
					new FileWriter(ruta + "/version.txt"));
			
			buffer.write("Ejemplo11\nAutor: carlos"
					+ "\nVersión: 1.0");
			
			buffer.close();
			
		} catch (IOException e) {
			System.out.println("Error accediendo al disco.");
		}
		
		// Renombramos el archivo version.txt.
		File original = new File(ruta + "/version.txt");
		File nuevo = new File(ruta + "/acercade.txt");
		
		original.renameTo(nuevo);
		
		System.out.println("Fin");
		
		
		
		
		
	}

}
