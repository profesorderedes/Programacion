package hoja2;

public class Ejer15 {

	public static void main(String[] args) {

		int exponente = 0;
		double potencia = 1;
		do {

			System.out.println(exponente + ") " + potencia);

			exponente++;
			potencia = Math.pow(3, exponente);

		} while (potencia < 12000);

	}

}
