package hoja1;

import java.util.Scanner;

public class Ejer21 {

	public static void main(String[] args) {

// Diseña una aplicación donde un usuario pueda elegir el idioma de una frase de saludo. En
// primer lugar se mostrará un menú:

// (1) Francés
// (2) Inglés
// (3) Alemán
// (4) Italiano

// El usuario escribirá un número entero entre 1 y 4 para señalar qué opción quiere y, a continuación,
// aparecerá la frase "Buenos días" en el idioma que corresponda (puedes usar Google translator). Si
// escribe otro número, el mensaje se mostrará en español.

		Scanner input = new Scanner(System.in);

		System.out.println("\t\"TRADUCTOR\"");
		System.out.print("\nElige una opción del menú");
		System.out.print("\n\n\t(1) Francés\n\t(2) Inglés\n\t(3) Alemán\n\t(4) Italiano\n\n> ");
		int choice = input.nextInt();

		switch (choice) {
		case 1:

			System.out.println("\nBonjour");
			break;
		case 2:

			System.out.println("\nGood morning");
			break;
		case 3:

			System.out.println("\nGuten Morgen");
			break;
		case 4:

			System.out.println("\nBuongiorno");
			break;
		default:

			System.out.println("\nBuenos días");
		}

	}

}