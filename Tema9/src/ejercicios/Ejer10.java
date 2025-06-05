package ejercicios;

public class Ejer10 {

	public static void main(String[] args) {

		int[] nums = { 5, 2, 8 };
		int cantidad = nums.length;

		int resultado = multiplicar(nums, cantidad);

		System.out.println("La multiplicacion de los números es " + resultado);

	}

	public static int multiplicar(int[] lista, int n) {

		// Caso base.
		if (n == 0) {

			return 1;

		} else {

			// Caso recursivo.
			return lista[n - 1] * multiplicar(lista, n - 1);

		}

	}

}