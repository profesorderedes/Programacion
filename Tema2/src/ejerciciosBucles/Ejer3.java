package ejerciciosBucles;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Pedimos un número que debe estar entre 1 y 10.
		System.out.println("Escribe un número entre 1 y 10:");
		int num = entrada.nextInt();

		// Si el número no es válido, volvemos a pedirlo
		// hasta que lo sea.
		while (num < 1 || num > 10) {

			System.out.println("Escribe un número entre 1 y 10:");
			num = entrada.nextInt();

		}

		// Una vez que el número ya sea válido, lo mostramos.
		System.out.println("Has escrito el número " + num);

	}

}
