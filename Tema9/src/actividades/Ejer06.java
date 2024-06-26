package actividades;

public class Ejer06 {

	public static void main(String[] args) {

		int[] array = { -2, 1, 9, 5, 7, 0, 3, 2, 8, 6 };

		int min = min(array, array.length);

		System.out.println("El mínimo del array es: " + min);

	}

	private static int min(int[] numeros, int numElementos) {

		// Caso base: Si la longitud del array es 1, devuelve el único elemento.

		if (numElementos == 1) {

			return numeros[0];

		}

		// Caso recursivo.

		return minimo(min(numeros, numElementos - 1), numeros[numElementos - 1]);

	}

	// En vez de este método podríamos usar Math.min().
	private static int minimo(int a, int b) {
		return a < b ? a : b;
	}

}
