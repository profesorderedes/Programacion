// Buscar el mínimo de un array a partir de una posición
package ejemplosArrays;


public class Ejemplo07 {

	public static void main(String[] args) {

		int[] notas = { 8, 4, 5, 9, 7 };

		System.out.println("Mínimo del array empezando por la posición 0:");

		// Empezamos suponiendo que el mínimo está en la posición 0.
		int posMin = 0;

		// Recorremos el array desde la posición 1.
		for (int i = 1; i < notas.length; i++) {

			// Si en una posición i hay un valor más pequeño que el mínimo hasta
			// el momento, i será la nueva posición del mínimo.
			if (notas[i] < notas[posMin]) {
				posMin = i;
			}

		}

		System.out.println("Posición del mínimo: " + posMin);

		System.out.println("\nMínimo del array empezando por la posición 3:");

		// Empezamos suponiendo que el mínimo está en la posición 3.
		posMin = 3;

		// Recorremos el array desde la posición 4.
		for (int i = 4; i < notas.length; i++) {

			// Si en una posición i hay un valor más pequeño que el mínimo hasta
			// el momento, i será la nueva posición del mínimo.
			if (notas[i] < notas[posMin]) {
				posMin = i;
			}

		}

		System.out.println("Posición del mínimo: " + posMin);
		System.out.println("Valor del mínimo: " + notas[posMin]);

	}

}
