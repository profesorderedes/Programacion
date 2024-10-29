package hoja2;

public class Ejer15b {

	public static void main(String[] args) {

		System.out.println("Potencias de 3 menores de 12.000:");

		int exponente = 0;

		do {
			System.out.println(exponente + ") " + Math.pow(3, exponente));
			exponente++;
		} while (Math.pow(3, exponente) < 12000);

		System.out.println("De nada.");

	}

}
