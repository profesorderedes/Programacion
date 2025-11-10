package hoja1;

public class Ejer13 {

	public static void main(String[] args) {

		int potencias[] = new int[20];
		int i = 0;
		int pot = 2;

		while (i < potencias.length) {

			potencias[i] = pot;
			pot = pot * 2;

			i++;

		}

		for (i = 0; i < potencias.length; i++) {

			System.out.println("> " + (i + 1) + ") " + potencias[i]);

		}

	}

}