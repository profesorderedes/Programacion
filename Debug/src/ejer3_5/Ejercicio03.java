package ejer3_5;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String vocales[] = { "a", "e", "i", "o", "u", "A", "E", "I", "O", "U" };

		int contadorVocales = 0;

		System.out.println("Escribe una frase, por favor, y te diré cuántas vocales tiene:");
		String frase = entrada.nextLine();

		for (int i = 0; i < frase.length(); i++) {

			for (int j = 0; j < vocales.length; j++) {

				if (vocales[j].equals(""+frase.charAt(i))) {
					contadorVocales++;
				}
			}
		}

		System.out.println("\nEn tu frase hay " + contadorVocales + " vocales.");

	}

}