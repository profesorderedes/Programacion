package ejercicios;

public class Ejer07 {

	public static void main(String[] args) {

		System.out.println(invertir(2751));

	}

	private static String invertir(int n) {

		if(n < 0) {
			return "No se aceptan números negativos.";
		}
		
		// Caso base.
		if (n < 10) {
			return "" + n;
		}

		// Caso recursivo.
		return (n % 10) + invertir(n / 10);

	}

}