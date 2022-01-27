package ejercicios;

import java.util.Arrays;

public class Ejer05 {

	public static void main(String[] args) {

		int numeros[] = { 10, 4, 2, 7, 7, 8 };

		int resultado[] = ordenarArray(numeros);

		for (int i = 0; i < resultado.length; i++) {
			System.out.println(resultado[i]);
		}

		System.out.println(Arrays.toString(numeros));

	}

	static int[] ordenarArray(int[] numeros) {

		int posMin = 0;
		int aux;

		for (int i = 0; i < numeros.length - 1; i++) {

			posMin = i;

			for (int j = i + 1; j < numeros.length; j++) {

				if (numeros[j] < numeros[posMin]) {

					posMin = j;

				}

			}

			aux = numeros[i];
			numeros[i] = numeros[posMin];
			numeros[posMin] = aux;

		}

		// El array ya está ordenado.

		return numeros;

	}

}