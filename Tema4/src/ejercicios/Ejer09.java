package ejercicios;

public class Ejer09 {

	public static void main(String[] args) {

		int maximo = max(5, 4);
		int minimo = min(3, 1);

		System.out.println("El numero más grande es: " + maximo);
		System.out.println("El número más pequeño es: " + minimo);

	}

	static int max(int x, int y) {

		if (x > y) {
			return x;
		} else {
			return y;
		}

	}

	static int min(int x, int y) {

		if (x < y) {
			return x;
		} else {
			return y;
		}

	}

}