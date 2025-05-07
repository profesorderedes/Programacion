package ejercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {

		final String NOMBRE_ARCHIVO = "ficheros/contactos.txt";

		pedirDatos(NOMBRE_ARCHIVO);

	}

	private static void pedirDatos(String nombreArchivo) {

		Scanner teclado = new Scanner(System.in);

		try {
			FileWriter archivo = new FileWriter(nombreArchivo, true);
			BufferedWriter buffer = new BufferedWriter(archivo);

			for (int i = 1; i <= 3; i++) {
				System.out.println("Apellidos:");
				String apellidos = teclado.nextLine();
				buffer.write(apellidos + ",");

				System.out.println("Nombre:");
				String nombre = teclado.nextLine();
				buffer.write(nombre + ",");

				System.out.println("Número de teléfono:");
				String numero = teclado.nextLine();
				buffer.write(numero + "\n");
			}

			buffer.close();

		} catch (IOException e) {
			System.out.println("Error al abrir el archivo");
			e.printStackTrace();
		}
	}

}