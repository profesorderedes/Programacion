package ejercicios;

public class Ejer05 {

	public static void main(String[] args) {

		int n = 10;
		System.out.println("La suma de los números del 1 al " + n + " es: " + sumaHasta(n));

	}

	static int sumaHasta(int n) {

		// Caso base
		if (n == 0) {
			return 0;
		}

		// Caso recursivo.
		return n + sumaHasta(n - 1);

	}

}
