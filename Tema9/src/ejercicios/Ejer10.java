package ejercicios;

public class Ejer10 {

	public static void main(String[] args) {

		int[] nums = { 5, 2, 8, 3 };

		int resultado = multiplicar(nums, nums.length);

		System.out.println("La multiplicación de los números es " 
				+ resultado);

	}

	public static int multiplicar(int[] lista, int n) {

		
		if (n == 1) {
			// Caso base.
			return lista[0];

		} else {

			// Caso recursivo.
			return lista[n - 1] * multiplicar(lista, n - 1);

		}

	}

}