package hoja2;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un número entre 1 y 10:");
		int num = entrada.nextInt();

		while (num < 1 || num > 10) {

			// Volvemos a preguntar el número, porque no es válido.
			System.out.println("Tienes que escribir un número entre 1 y 10:");
			num = entrada.nextInt();

		}

		System.out.println("Has escrito el número " + num + ".");

	}

}
