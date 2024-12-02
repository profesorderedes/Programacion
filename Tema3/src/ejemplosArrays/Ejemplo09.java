// Método de selección: ordenar un array de menor a mayor.
package ejemplosArrays;


import java.util.Arrays;

public class Ejemplo09 {

	public static void main(String[] args) {

		int[] notas = { 8, 4, 5, 9, 7 };

		int posMin;
		int aux;

		// Recorremos el array hasta la penúltima posición (la última ya
		// quedará con el valor correcto por descarte).
		for (int i = 0; i < notas.length - 1; i++) {

			// Fase de búsqueda: buscamos el mínimo desde la primera
			// posición del array que está todavía sin ordenar.
			// La variable i apunta siempre a la primera posición del array
			// aún sin ordenar.
			posMin = i;
			for (int j = i + 1; j < notas.length; j++) {
				if (notas[j] < notas[posMin]) {
					posMin = j;
				}
			}

			// En este punto del programa, posMin es la posición con el valor
			// más pequeño de la parte del array aún no ordenada.

			// Fase de intercambio: intercambios el mínimo (que está en la
			// posición posMin) por el primer elemento del array aún sin ordenar.
			aux = notas[i];
			notas[i] = notas[posMin];
			notas[posMin] = aux;
			
			System.out.println(Arrays.toString(notas));

		}
		
		System.out.println("El array ordenado ha quedado:");
		System.out.println(Arrays.toString(notas));

	}
}
