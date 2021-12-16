package ejercicios2;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Ejercicio 11 mostrando las edades de mayor a menor
 */
public class Ejer11b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int edades[] = new int[10];
		int posMax;
		int aux;

		// Leemos las edades.

		for (int i = 0; i < edades.length; i++) {
			System.out.print("Edad " + i + ": ");
			edades[i] = entrada.nextInt();
		}

		// Ordenamos de menor a mayor.

		for (int i = 0; i < edades.length - 1; i++) {

			posMax = i;
			for (int j = i + 1; j < edades.length; j++) {

				if (edades[j] > edades[posMax]) {
					posMax = j;
				}

			}

			aux = edades[posMax];
			edades[posMax] = edades[i];
			edades[i] = aux;

		}

		// Resultado.
		System.out.println("\nEdades de mayor a menor:");
		System.out.println(Arrays.toString(edades));

	}

}
