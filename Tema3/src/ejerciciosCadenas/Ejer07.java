package ejerciciosCadenas;

import java.util.Scanner;

public class Ejer07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String[] palabrotas = { "botarate", "bribón", "mastuerzo", "mentecato", "rufián" };

		System.out.println("### CENSOR ###");
		System.out.println("Escribe una frase.");
		String frase = entrada.nextLine();

		// Buscamos si aparecen palabrotas en la frase.

		boolean hayPalabrotas = false;
		for (int i = 0; i < palabrotas.length; i++) {
			if (frase.indexOf(palabrotas[i]) >= 0) {
				System.out.println("Alerta de palabrotas");
				hayPalabrotas = true;
				break;
			}
		}

		if (!hayPalabrotas) {
			System.out.println("La frase es correcta.");
		}

	}

}
