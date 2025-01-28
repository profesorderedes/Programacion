package hoja2;

import java.util.Arrays;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) throws InterruptedException {

		Scanner teclado = new Scanner(System.in);

		double[] temperaturas = new double[8];
		double aux;
		int posMin;

		System.out.println("Dime las temperaturas del dia");

		// Leemos las temperaturas.
		for (int i = 0; i < temperaturas.length; i++) {
			temperaturas[i] = teclado.nextInt();
		}

		// Ordenamos las temperaturas de menor a mayor.
		for (int i = 0; i < temperaturas.length - 1; i++) {

			// Fase de búsqueda.
			posMin = i;
			for (int j = i + 1; j < temperaturas.length; j++) {

				if (temperaturas[j] < temperaturas[posMin]) {
					posMin = j;
				}

			}

			// Fase de intercambio.
			aux = temperaturas[i];
			temperaturas[i] = temperaturas[posMin];
			temperaturas[posMin] = aux;

			System.out.println(Arrays.toString(temperaturas));

			// Hacemos una pequeña pausa dramática de 500 ms
			Thread.sleep(500);

		}

		System.out.println("La temperatura ordenada es " + Arrays.toString(temperaturas));
		System.out.println("El mínimo es " + temperaturas[0]);
		System.out.println("El máximo es " + temperaturas[temperaturas.length - 1]);

	}

}