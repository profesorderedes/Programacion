package extraEjerciciosCadenas;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {

		/*
		 * 
		 * Crea un programa que te pregunte el nombre de un archivo (incluyendo su
		 * 
		 * extensión) y te indique por separado el nombre y la extensión
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese un archivo: ");
		String archivo = sc.nextLine();

		String[] partes = archivo.split("\\.");

		System.out.print("Nombre: ");

		for (int i = 0; i < partes.length - 1; i++) {

			System.out.print(partes[i]);
			// Si no hemos llegado al final del nombre, ponemos un punto a continuación.
			if (i != partes.length - 2) {
				System.out.print(".");
			}

		}

		System.out.println("\nExtensión: " + partes[partes.length - 1]);

	}

}