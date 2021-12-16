package ejercicios2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int edades[] = new int[10];
		int posMin;
		int aux;

		// Leemos las edades.

		for (int i = 0; i < edades.length; i++) {
			System.out.print("Edad " + i + ": ");
			edades[i] = entrada.nextInt();
		}

		// Ordenamos de menor a mayor.

		for (int i = 0; i < edades.length - 1; i++) {

			posMin = i;
			for (int j = i + 1; j < edades.length; j++) {

				if (edades[j] < edades[posMin]) {
					posMin = j;
				}

			}

			aux = edades[posMin];
			edades[posMin] = edades[i];
			edades[i] = aux;

		}

		// Resultado.
		System.out.println("\nEdades de menor a mayor:");
		System.out.println(Arrays.toString(edades));

	}

}
