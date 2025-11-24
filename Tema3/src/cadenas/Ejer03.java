package cadenas;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {

// Programa que pide una frase y luego la muestra del revés (letra a letra).

		Scanner input = new Scanner(System.in);

		System.out.println("Dime una frase: ");
		String frase = input.nextLine();

		for (int i = frase.length() - 1; i >= 0; i--) {

			System.out.print(frase.charAt(i));

		}

	}

}