package ejerciciosCadenas;

import java.util.Scanner;

public class Ejer08 {

	public static void main(String[] args) {

		/*
		 * Programa que lee una frase desde el teclado y nos muestra la primera palabra.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una frase:");
		String frase = sc.nextLine();

		// Si no hay ningún espacio, la primera palabra será toda la frase.

		int posPrimerEspacio = frase.indexOf(" ");

		if (posPrimerEspacio == -1) {
			System.out.println(frase);
		} else {
			// Si se encuentra algún espacio, la primera palabra será desde la posición 0
			// hasta la del primer espacio.
			for (int i = 0; i < posPrimerEspacio; i++) {

				System.out.print(frase.charAt(i));

			}
		}

	}

}