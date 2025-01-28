package hoja2;

import java.util.Arrays;

// Array del ejercicio 9 pero ordenado de mayor a menor.

class Ejer09b {

	public static void main(String[] args) throws InterruptedException {

		int[] precios = { 43, 58, 44, 62, 80, 15, 15, 10, 90, 56 };

		int aux;
		int posMax;

		System.out.println(Arrays.toString(precios));
		for (int i = 0; i < precios.length - 1; i++) {

			posMax = i;

			for (int j = i + 1; j < precios.length; j++) {

				// Como queremos ordenar de mayor a menor, cambiamos
				// el símbolo < por >, para buscar máximo en vez de
				// mínimo.
				if (precios[j] > precios[posMax]) {
					posMax = j;
				}

			}

			aux = precios[i];
			precios[i] = precios[posMax];
			precios[posMax] = aux;

			System.out.println(Arrays.toString(precios));

			// Hacemos una pequeña pausa dramática de 500 ms.
			Thread.sleep(500);

		}

		System.out.println("ARRAY ORDENADO:");
		System.out.println(Arrays.toString(precios));

	}

}