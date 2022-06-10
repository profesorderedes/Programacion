import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * Programa que convierte un archivo de texto
 * a mayúsculas.
 */
public class Ejemplo10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Preguntamos el nombre del archivo.
		System.out.println("      *** PASAR A MAYÚSCULAS ***");
		System.out.println("\nEscribe el nombre de un archivo" + " para que te lo pase a mayúsculas:");
		String nombreArchivo = entrada.nextLine();

		try {

			// Abrimos el archivo para lectura.
			BufferedReader bufferLectura = new BufferedReader(new FileReader("ficheros/" + nombreArchivo));

			// Abrimos el archivo temporal.txt para escritura.
			BufferedWriter bufferEscritura = new BufferedWriter(new FileWriter("ficheros/temporal.txt"));

			// Leemos la primera línea del archivo original.
			String linea = bufferLectura.readLine();

			// Vamos leyendo línea a línea mientras no
			// obtengamos un null en readLine().
			while (linea != null) {

				// Pasamos la línea a mayúsculas.
				linea = linea.toUpperCase();

				// Guardamos esta línea en el archivo temporal.
				bufferEscritura.write(linea + "\n");

				// Leemos la siguiente línea.
				linea = bufferLectura.readLine();
			}

			// Cerramos ambos archivos.
			bufferLectura.close();
			bufferEscritura.close();

			// Borramos el archivo original.
			File original = new File("ficheros/" + nombreArchivo);
			original.delete();

			// Renombramos el archivo temporal.
			File temporal = new File("ficheros/temporal.txt");
			temporal.renameTo(original);

			System.out.println("Operación finalizada.");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
