package ejercicios;

public class Ejer11 {

	public static void main(String[] args) {

		double[] numeros = { 8, 3, 15, -2, 72.5, 50 };
		int cantidad = numeros.length;

		double maximo = maximoArray(numeros, cantidad);

		System.out.println("El valor máximo es: " + maximo);

	}

	public static double maximoArray(double[] array, int numElementos) {

		// Caso base.
		if (numElementos == 1) {
			return array[0];
		}

		// Caso recursivo.
		double maximoDelResto = maximoArray(array, numElementos - 1);
		double ultimoElemento = array[numElementos - 1];

		return Math.max(ultimoElemento, maximoDelResto);

	}

}