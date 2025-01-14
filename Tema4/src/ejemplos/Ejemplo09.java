package ejemplos;

import java.util.Arrays;

// Ejemplo de lo que no hay que hacer (usar variables globales en vez de 
// parámetros).

public class Ejemplo09 {

	static int[] notas = { 10, 8, 9, 6, 7, 9, 10, 9, 5, 8 };

	public static void main(String[] args) {

		int min = minimo();

		System.out.println("El mínimo del array es " + min + ".");

		System.out.println(Arrays.toString(notas));

	}

	static int minimo() {

		int posMin = 0;

		for (int i = 1; i < notas.length; i++) {
			if (notas[i] < notas[posMin]) {
				posMin = i;
			}
		}

		return notas[posMin];

	}

}
