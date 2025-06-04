package ejercicios;

public class Ejer06 {

	public static void main(String[] args) {

		int[] numeros = { 8, 3, 15, -2, 7, -10 };
		int cantidad = numeros.length;

		int minimo = minimoArray(numeros, cantidad);

		System.out.println("El valor mínimo es: " + minimo);

	}

	public static int minimoArray(int[] array, int numElementos) {

		// Caso base.
		if (numElementos == 1) {
			return array[0];
		}

		// Caso recursivo.
		System.out.println("Calculando el mínimo del array de 0 a " + (numElementos - 1));
		int minimoDelResto = minimoArray(array, numElementos - 1);
		int ultimoElemento = array[numElementos - 1];

		return Math.min(ultimoElemento, minimoDelResto);
		
	}

}