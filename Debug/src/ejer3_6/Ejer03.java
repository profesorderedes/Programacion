package ejer3_6;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una frase, por favor, y te diré cuántas vocales tiene:");
		String frase = entrada.nextLine().toLowerCase();

		int vocal = 0;

		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o'
					|| frase.charAt(i) == 'u') {
				vocal++;
			}
		}

		System.out.println("\nEn tu frase hay " + vocal + " vocales.");

	}

}