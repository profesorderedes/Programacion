package ejer3_3;

import java.util.Scanner;

public class Act3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int vocales = 0;

		System.out.println("Escribe una frase, por favor, y te diré cuátos vocales tiene:");
		String frase = entrada.nextLine().toLowerCase();

		for (int i = 0; i < frase.length(); i++) {

			if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o'
					|| frase.charAt(i) == 'u') {
				vocales++;
			}

		}

		System.out.println("En tu frase hay " + vocales + " vocales.");

	}

}