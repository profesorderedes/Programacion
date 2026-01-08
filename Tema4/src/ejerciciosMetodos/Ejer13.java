package ejerciciosMetodos;

import java.util.Arrays;

public class Ejer13 {

	public static void main(String[] args) {

		int[] edades = { 85, 30, 92, 95, 40, 26 };

		edades = arrayOrdenado(edades);

		System.out.println(Arrays.toString(edades));

	}

	/**
	 * Ordena un array de números enteros recibido como parámetro y lo devuelve.
	 * 
	 * @param numeros Array de números que hay que ordenar.
	 * @return El array ordenado.
	 */
	static int[] arrayOrdenado(int[] numeros) {

		int posMin, aux;

		for (int i = 0; i < numeros.length - 1; i++) {

			posMin = i;

			// Buscamos la posición del menor número entre i y el final.
			for (int j = i + 1; j < numeros.length; j++) {
				if (numeros[j] < numeros[posMin]) {
					posMin = j;
				}
			}

			// Intercambiamos el menor con la posición i.
			aux = numeros[i];
			numeros[i] = numeros[posMin];
			numeros[posMin] = aux;

		}

		return numeros;

	}

}
