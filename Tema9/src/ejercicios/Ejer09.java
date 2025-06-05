package ejercicios;

public class Ejer09 {

	public static void main(String[] args) {

		int[] numeros = { 5, 5, 21, 4 };

		System.out.println("Resultado: " + sumar(numeros, numeros.length));

	}

// Crea un método int sumar(int[] lista, int n) que calcule la suma de los
// elementos de un array lista de n números enteros.
	public static int sumar(int[] lista, int n) {

		// Caso base
		if (n == 1) {
			return lista[0];
		}

		// Caso recursivo
		return  lista[n-1] + sumar(lista, n - 1);

	}

}
