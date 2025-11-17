package ejemplos;

public class Ejemplo07IntercambiarValores {

	public static void main(String[] args) {

		int a = 10, b = 50;

		int aux;

		aux = a;
		a = b;
		b = aux;

		System.out.println("a = " + a + "; b = " + b);

	}

}
