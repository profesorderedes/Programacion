
// Cálculo del factorial de forma recursiva.

public class Factorial {

	public static void main(String[] args) {

		System.out.println("El factorial de 6 es " + factorial(6));

	}

	private static int factorial(int n) {

		if (n == 1) {
			return 1;
		} else {
			System.out.println(n + " * factorial(" + (n - 1) + ")");
			return n * factorial(n - 1);
		}

	}

}
