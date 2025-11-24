package ejemplosArrays;

import java.util.Arrays;

public class Ejemplo08Ordenar {

	public static void main(String[] args) {

		int[] numeros = { 20, 15, 8, 3, 6 };
		int posMin;
		int aux;

		System.out.println("Array sin ordenar:");
		System.out.println(Arrays.toString(numeros));

		// La i nos indica en cada momento dónde comienza la parte no ordenada aún
		// del array.
		for (int i = 0; i < numeros.length - 1; i++) {

			// Buscamos el mínimo del trozo de array entre i y el final.

			posMin = i;
			for (int j = i + 1; j < numeros.length; j++) {

				if (numeros[j] < numeros[posMin]) {
					posMin = j;
				}

			}

			// Intercambiamos el valor en posMin por el valor en i.
			// O sea, colocamos el elemento más pequeño del array sin ordenar
			// al principio del array sin ordenar.

			aux = numeros[posMin];
			numeros[posMin] = numeros[i];
			numeros[i] = aux;

			System.out.println(Arrays.toString(numeros));

		}

		System.out.println("\nArray ordenado:");
		System.out.println(Arrays.toString(numeros));

	}

}
