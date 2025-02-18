package ejer3_1;

import java.util.Scanner;

public class Ejer03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una frase, por favor, y te diré cuántas vocales tiene:");
		String frase = entrada.nextLine();
		frase = frase.toLowerCase();

		String[] vocales = { "a", "e", "i", "o", "u" };

		int contadorVocalesFinal = 0;

		for (int i = 0; i < frase.length(); i++) {
			System.out.println("Miramos si " + frase.charAt(i) + " es una vocal.");
			for (int j = 0; j < vocales.length; j++) {

				if (String.valueOf(frase.charAt(i)).equals(vocales[j])) {
					contadorVocalesFinal++;
					System.out.println("Lo es.");
					break;
				}

			}

		}

		System.out.println("Hay " + contadorVocalesFinal + " vocales.");

	}
}
