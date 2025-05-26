package ejemplos;

public class Ejemplo06Factorial {

	public static void main(String[] args) {

		System.out.println(factorial(0));

	}

	static int factorial(int n) {
		
		// Condición previa para asegurarnos de que no 
		// intentamos calcular el factorial de un número
		// negativo.
		if(n < 0) {
			return -1;
		}

		// Caso base: si n=0 ó n=1, devolvemos 1 porque ése es el
		// valor de factorial de 1.
		if (n == 0 || n == 1) {
			return 1;
		}

		// Caso general: Si n es mayor que 1, se aplicará
		// las siguiente fórmula:
		return n * factorial(n - 1);

	}

}
