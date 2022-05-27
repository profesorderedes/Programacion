
public class FactorialIterativo {

	public static void main(String[] args) {

		System.out.println("El factorial de 6 es " + factorial(6));

	}

	private static int factorial(int n) {

		int resultado = 1;
		for (int i = n; i >= 1; i--) {
			resultado = resultado * i;
		}
//		for (int i = 2; i <= n; i++) {
//			resultado = resultado * i;
//		}
		return resultado;

	}

}
