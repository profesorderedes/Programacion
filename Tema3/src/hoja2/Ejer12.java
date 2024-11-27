package hoja2;

import java.util.Arrays;

public class Ejer12 {

	public static void main(String[] args) {

		int[] elementos = { 8, 2, 10, 20, 12, 71, 15, 23 };
		int aux;
		int posMin;

		for (int i = 0; i < elementos.length - 1; i++) {

			posMin = i;

			for (int j = i + 1; j < elementos.length; j++) {

				if (elementos[j] < elementos[posMin]) {
					posMin = j;
				}

			}

			aux = elementos[i];
			elementos[i] = elementos[posMin];
			elementos[posMin] = aux;

		}

		System.out.println("El array ordenado es " + Arrays.toString(elementos));
		System.out.println("El mínimo es " + elementos[0]);
		System.out.println("El máximo es " + elementos[7]);

	}

}