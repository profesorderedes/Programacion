package ejerciciosCadenas;

import java.util.Scanner;

public class Ejer13 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String[] palabras = new String[5];

		// Leemos 5 palabras.

		System.out.println("Escribe 5 palabras:");
		for (int i = 0; i < palabras.length; i++) {
			palabras[i] = entrada.nextLine();
		}

		// Buscamos la menor alfabéticamente.

		int posMin = 0;
		for (int i = 1; i < palabras.length; i++) {

			if (palabras[i].compareTo(palabras[posMin]) < 0) {
				posMin = i;
			}

		}

		System.out.println("La primera palabra en orden alfabético es " + palabras[posMin] + ".");

	}

}
