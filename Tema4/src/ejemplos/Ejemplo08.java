package ejemplos;

import java.util.Arrays;

public class Ejemplo08 {

	// Variable global: puede accederse (leer o escribir) desde cualquier
	// método del programa.
	// Basta que esté declarada fuera de cualquier método (para que sea global).
	static String nombre;

	public static void main(String[] args) {

		nombre = "Pepe";

		int[] notasPrimeraEval = { 10, 8, 9, 6, 7, 9, 10, 9, 5, 8 };

		int min = minimo(notasPrimeraEval);

		System.out.println("El mínimo del array es " + min + ".");

		System.out.println(Arrays.toString(notasPrimeraEval));

		System.out.println("La variable nombre vale " + nombre);

	}

	static int minimo(int[] notas) {

		System.out.println("La variable nombre vale " + nombre);

		int posMin = 0;

		for (int i = 1; i < notas.length; i++) {
			if (notas[i] < notas[posMin]) {
				posMin = i;
			}
		}

		return notas[posMin];

	}

}
