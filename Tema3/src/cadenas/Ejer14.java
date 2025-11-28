package cadenas;

import java.util.Arrays;

import java.util.Scanner;

public class Ejer14 {

	public static void main(String[] args) {

		// Programa que te pide cinco palabras, las guarda en un
		// array, y ordena el array alfabéticamente.

		Scanner input = new Scanner(System.in);

		String[] palabras = new String[5];

		for (int i = 0; i < palabras.length; i++) {

			System.out.println("Escribe una palabra: ");
			palabras[i] = input.nextLine();

		}

		int posMin;

		for (int i = 0; i < palabras.length - 1; i++) {

			posMin = i;

			for (int j = i; j < palabras.length; j++) {

				if (palabras[j].compareTo(palabras[posMin]) < 0) {
					posMin = j;
				}

			}

			String temp = palabras[posMin];
			palabras[posMin] = palabras[i];
			palabras[i] = temp;

		}

		System.out.println(Arrays.toString(palabras));

	}

}