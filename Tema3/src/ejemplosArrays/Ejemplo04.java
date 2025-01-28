// Algoritmo de búsqueda del mínimo y el máximo de un array.
package ejemplosArrays;

public class Ejemplo04 {

	public static void main(String[] args) {

		int[] notas = { 5, 1, 0, 8, 10 };

		// Tomamos como mínimo provisional el primer número del array.
		int min = notas[0];

		// Tomamos como máximo provisional el primer número del array.
		int max = notas[0];

		// Recorremos el resto del array, desde la posición 1 hasta el final
		// y cada vez que encontremos un valor más pequeño, lo sustituiremos
		// en min. Lo mismo haremos si encontramos un valor más grande que max.

		for (int i = 1; i < notas.length; i++) {

			// Para cada casilla i comprobamos si el valor guardado es más
			// pequeño que el de min. Si es así, lo cambiamos.
			if (notas[i] < min) {
				min = notas[i];
			}

			// Para cada casilla i comprobamos si el valor guardado es más
			// grande que el de max. Si es así, lo cambiamos.
			if (notas[i] > max) {
				max = notas[i];
			}

		}

		System.out.println("El valor más pequeño del array es " + min + ".");
		System.out.println("El valor más grande del array es " + max + ".");

	}

}
