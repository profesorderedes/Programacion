package cadenas;

import java.util.Scanner;

// Programa que lee una frase desde el teclado y nos alerta
// de si contiene algunda palabra malsonante. Las palabras
// malsonantes las buscará en un array llamado palabrotas.

public class Ejer07 {

	public static void main(String[] args) {

		String[] palabrotas = { "botarate", "mentecato", "rufián" };

		Scanner input = new Scanner(System.in);

		System.out.println("Dime una frase: ");
		String frase = input.nextLine();

		for (int i = 0; i < palabrotas.length; i++) {

			if (frase.indexOf(palabrotas[i]) != -1) {

				System.out.println("Tu frase contiene una palabrota. >:(");
				return;

			}

		}

		System.out.println("Tu frase no contiene palabrotas. :)");

	}

}