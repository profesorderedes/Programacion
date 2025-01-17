package ejemplos;

import java.util.Arrays;

public class Ejemplo07 {

	public static void main(String[] args) {

		int[] notasPrimeraEval = { 10, 8, 9, 6, 7, 9, 10, 9, 5, 8 };

		int min = minimo(notasPrimeraEval);

		System.out.println("El mínimo del array es " + min + ".");

		System.out.println(Arrays.toString(notasPrimeraEval));

	}

	// notas se pasa por referencia: si cambia dentro del método,
	// cambia también la variable original.
	// En Java, cualquier variable que no sea de tipo primitivo
	// se pasa por referencia.
	static int minimo(int[] notas) {

		int posMin = 0;

		for (int i = 1; i < notas.length; i++) {
			if (notas[i] < notas[posMin]) {
				posMin = i;
			}
		}

		notas[0] = 0;

		return notas[posMin];

	}

}
