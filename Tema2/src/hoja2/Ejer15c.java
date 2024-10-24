package hoja2;

public class Ejer15c {

	public static void main(String[] args) {

		System.out.println("Potencias de 3 menores de 12.000:");

		int exponente = 0;
		int potencia = 1;

		do {
			System.out.println(exponente + ") " + potencia);
			exponente++;
			potencia = potencia * 3;
		} while (potencia < 12000);

		System.out.println("De nada.");

	}

}
