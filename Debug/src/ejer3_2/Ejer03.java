package ejer3_2;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String vocales = "aeiouáéíóú";

		int contadorVocales = 0;

		System.out.println("Escribe una frase, por favor, y te diré cuántas vocales tiene:");
		String frase = entrada.nextLine().toLowerCase();

		for (int i = 0; i < frase.length(); i++) {

			if (vocales.indexOf(frase.charAt(i)) != -1) {
				contadorVocales++;
			}

		}

		System.out.println("\nEn tu frase hay " + contadorVocales + " vocales.");
	}

}