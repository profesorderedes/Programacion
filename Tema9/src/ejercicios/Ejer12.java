package ejercicios;

import java.util.Arrays;

public class Ejer12 {

	public static void main(String[] args) {

		char[] frase = { 'A', 'L', 'A' };

		System.out.println("Frase: " + Arrays.toString(frase));
		System.out.println("\n¿Es palíndromo? " + esPalindromo(frase, 0, frase.length - 1));

	}

	private static boolean esPalindromo(char[] frase, int ini, int fin) {

		// Caso base
		if (ini >= fin) {
			return true;
		}

		// Caso recursivo
		if (frase[ini] == frase[fin]) {
			return esPalindromo(frase, ini + 1, fin - 1);
		}

		return false;

	}

}
