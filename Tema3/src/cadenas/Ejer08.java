package cadenas;

import java.util.Scanner;

//Programa que lee una frase desde el teclado y nos muestra
//la primera palabra.

public class Ejer08 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Dime una frase: ");
		String frase = input.nextLine();

		System.out.println("Primera palabra: ");

		for (int i = 0; i < frase.length(); i++) {

			if (frase.charAt(i) == ' ') {
				break;
			}

			System.out.print(frase.charAt(i));

		}

	}

}