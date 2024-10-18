package ejercicios;

import java.util.Scanner;

public class Ejer21 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("(1) Francés\n(2) Inglés\n(3) Alemán\n(4) Italiano");

		System.out.println("\nDime un idioma:");
		int idioma = entrada.nextInt();

		switch (idioma) {

		case 1:

			System.out.println("\"Buenos días\" en francés es: Bonjour");
			break;

		case 2:

			System.out.println("\"Buenos días\" en inglés es: Good morning");
			break;

		case 3:

			System.out.println("\"Buenos días\" en alemán es: Guten Morgen");
			break;

		case 4:

			System.out.println("\"Buenos días\" en italiano es: Buongiorno");
			break;
		
		default:
			System.out.println("Buenos días.");

		}

	}

}