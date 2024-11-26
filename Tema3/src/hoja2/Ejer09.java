package hoja2;

import java.util.Arrays;

class Ejer09 {

	public static void main(String[] args) {

		int[] precios = { 43, 58, 44, 62, 80, 15, 15, 10, 90, 56 };

		int aux;
		int posMin;

		System.out.println(Arrays.toString(precios));
		for (int i = 0; i < precios.length - 1; i++) {

			posMin = i;

			for (int j = i + 1; j < precios.length; j++) {

				if (precios[j] < precios[posMin]) {

					posMin = j;

				}

			}

			aux = precios[i];
			precios[i] = precios[posMin];
			precios[posMin] = aux;

			System.out.println(Arrays.toString(precios));

		}

		System.out.println("ARRAY ORDENADO:");
		System.out.println(Arrays.toString(precios));

	}

}