package ejemplos;

public class Ejemplo07Fibonacci {

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			System.out.print(fibonacci(i) + ", ");
		}

	}

	static int fibonacci(int n) {

		// Caso base.
		if (n == 0 || n == 1) {
			return 1;
		}

		// Caso general.
		return fibonacci(n - 1) + fibonacci(n - 2);

	}

}
