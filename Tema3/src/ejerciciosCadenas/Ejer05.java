package ejerciciosCadenas;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {

// Programa que lee una frase y nos dice por cuántas palabras está formada.

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un frase.");
		String frase = sc.nextLine();

		int espacios = 1;

		for (int i = 0; i < frase.length(); i++) {

			if (frase.charAt(i) == ' ') {

				espacios++;

			}
		}

		System.out.println("Está formado por " + espacios + " palabras.");

	}
}