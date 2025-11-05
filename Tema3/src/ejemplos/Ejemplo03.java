package ejemplos;

import java.util.Scanner;

public class Ejemplo03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String[] nombres = new String[4];

		// Leemos cuatro nombres desde la terminal y los almacenamos en el array.
		for (int i = 0; i < nombres.length; i++) {

			System.out.print("Nombre " + (i + 1) + ": ");
			nombres[i] = entrada.nextLine();

		}

		// Mostramos los nombres guardados en el array.
		System.out.println("\nNombres guardados en el array:");

		for (int i = 0; i < nombres.length; i++) {
			System.out.println("- " + nombres[i]);
		}

	}

}
