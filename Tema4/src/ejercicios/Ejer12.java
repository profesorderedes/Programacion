package ejercicios;

import java.util.Arrays;

public class Ejer12 {

// Desarrolla un método que tome un array de números enteros y lo muestre
// ordenado.

	public static void main(String[] args) {

		int nums[] = { 2, 6, 4, 1, 3, 6, 7, 8, 9, 0, };

		System.out.println("Array antes de ordenar: " + Arrays.toString(nums));

		ordenar(nums);

		System.out.println("Array después de ordenar: " + Arrays.toString(nums));

	}

	static void ordenar(int[] array) {

		int posMin = 0;
		int aux = 0;

		for (int i = 0; i < array.length - 1; i++) {

			posMin = i;

			for (int j = i + 1; j < array.length; j++) {

				if (array[j] < array[posMin]) {

					posMin = j;

				}

			}

			aux = array[i];
			array[i] = array[posMin];
			array[posMin] = aux;

		}

		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}

	}

}