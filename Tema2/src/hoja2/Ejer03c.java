package hoja2;

import java.util.Scanner;

public class Ejer03c {

	// Ejercicio 3 usando bucle for

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un número entre 1 y 10:");
		int num;

		// No hacer esto.
		for (num = entrada.nextInt(); num < 1 || num > 10; num = entrada.nextInt()) {

			// Volvemos a preguntar el número, porque no es válido.
			System.out.println("Escribe un número entre 1 y 10:");

		}

		System.out.println("Has escrito el número " + num + ".");

	}

}
