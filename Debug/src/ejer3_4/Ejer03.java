
//Escribe un programa que te pida que escribas una frase, y te diga cuántas vocales hay en ella. No
//importará si las vocales están en minúsculas o en mayúsculas.

package ejer3_4;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Escribe una frase");
		String frase = teclado.nextLine().toLowerCase();

		int contarVocales = 0;

		for (int i = 0; i < frase.length(); i++) {

			if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' 
					|| frase.charAt(i) == 'i' || frase.charAt(i) == 'o'
					|| frase.charAt(i) == 'u') {
				contarVocales++;
			}

		}

		System.out.println("En tu frase hay " + contarVocales + " vocales.");

	}
}