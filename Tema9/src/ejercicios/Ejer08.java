package ejercicios;

public class Ejer08 {

	public static void main(String[] args) {

		System.out.println(sumar(151));

	}

	private static int sumar(int n) {

		// Caso base
		if (n < 10) {
			return n;
		}

		// Caso general
		return (n % 10) + sumar(n / 10);

	}

}