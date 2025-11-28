package cadenas;

import java.util.Scanner;

public class Ejer13 {

	public static void main(String[] args) {

		// Programa que te pide cinco palabras y te dice cuál es la
		// que va primero, alfabéticamente.

		Scanner input = new Scanner(System.in);

		String[] palabras = new String[5];

		for (int i = 0; i < palabras.length; i++) {

			System.out.println("Escribe una palabra: ");
			palabras[i] = input.nextLine();

		}

		int posMin = 0;

		for (int i = 0; i < palabras.length; i++) {

			if (palabras[i].compareTo(palabras[posMin]) < 0) {
				posMin = i;
			}

		}

		System.out.println(palabras[posMin]);

	}

}