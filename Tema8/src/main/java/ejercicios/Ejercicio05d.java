package ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio05d {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Indique el nombre del archivo de texto plano: ");
		String archivo = entrada.nextLine();

		System.out.println("Indique la palabra que quiere buscar: ");
		String palabraABuscar = entrada.nextLine();

		System.out.println("La palabra " + palabraABuscar + " aparece "
				+ contarPalabraEnArchivo(archivo, palabraABuscar) + " veces en el archivo entero.");

	}

	private static int contarPalabraEnArchivo(String archivo, String palabraABuscar) {

		int n = 0;
		try {
			BufferedReader buffer = new BufferedReader(new FileReader("ficheros/" + archivo));

			String linea = buffer.readLine();

			while (linea != null) {
				String[] palabrasEnLinea = linea.split("[ .,;:¡!¿?()\"-]+");

				for (String palabra : palabrasEnLinea) {
					if (palabra.toUpperCase().equals(palabraABuscar.toUpperCase())) {
						n++;
					}
				}

				linea = buffer.readLine();

			}

			buffer.close();

		} catch (FileNotFoundException e) {
			System.out.println(
					"Error al buscar archivo. No existe archivo con el nombre " + archivo + " en la carpeta ficheros/");

		} catch (IOException e) {
			System.out.println("Error al leer el archivo");
		}

		return n;
	}

	private static int contarPalabraEnLinea(String linea, String palabraABuscar) {

		int numRepeticiones = 0;

		int pos = linea.indexOf(palabraABuscar);

		while (pos != -1) {

			numRepeticiones++;
			pos = linea.indexOf(palabraABuscar, pos + 1);

		}
		
		return numRepeticiones;

	}

}


















