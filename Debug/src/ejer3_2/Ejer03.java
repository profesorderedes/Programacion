package ejer3_2;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String[] vocales = { "a", "e", "i", "o", "u", "A", "E", "I", "O", "U", "á", "é", "í", "ó", "ú", "Á", "É", "Í",
				"Ó", "Ú" };

		int contadorVocales = 0;

		System.out.println("Escribe una frase, por favor, y te diré cuántas vocales tiene:");
		String frase = entrada.nextLine();

		for (int i = 0; i < vocales.length; i++) {

			if (frase.indexOf(vocales[i]) >= 0) {
				contadorVocales++;

				if (frase.indexOf(vocales[i]) >= 0) {
					contadorVocales++;
				}
			}
		}

		System.out.println("\nEn tu frase hay " + contadorVocales + " vocales.");
	}

}