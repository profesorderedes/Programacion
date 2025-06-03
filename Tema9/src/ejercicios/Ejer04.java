package ejercicios;

public class Ejer04 {

	public static void main(String[] args) {

		System.out.println(calcular(20, 6));

	}

	private static int calcular(int dividendo, int divisor) {

		if (dividendo < divisor) {
			// Caso base
			return 0;

		}else {

			// Caso recursivo
			System.out.println("Restamos " + dividendo + " - " + divisor);
			System.out.println("Y llamamos al método con el nuevo dividendo: " + (dividendo - divisor));
			return 1 + calcular(dividendo - divisor, divisor);

		}

	}

}