package repaso;

import java.util.Scanner;

// Programa que pregunta cinco nombres y los ordena alfabéticamente.
import java.util.Arrays;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {

// Programa que pregunta cinco nombres y los ordena alfabéticamente

		Scanner entrada = new Scanner(System.in);
		String[] nombres = new String[5];

		for (int i = 0; i < nombres.length; i++) {

			System.out.println("Nombre nº " + i + ": ");
			nombres[i] = entrada.nextLine();

		}

		// Ordenar.
		int posMin;
		String aux;

		for (int i = 0; i < nombres.length - 1; i++) {

			posMin = i;
			for (int j = i + 1; j < nombres.length; j++) {

				if (nombres[j].compareTo(nombres[posMin]) < 0) {
					posMin = j;
				}

			}

			aux = nombres[posMin];
			nombres[posMin] = nombres[i];
			nombres[i] = aux;

		}

		System.out.println(Arrays.toString(nombres));

	}

}