package cadenas;

import java.util.Scanner;

//Programa que pide una frase y luego muestra la primera palabra.

public class Ejer04 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Dime una frase: ");
		String frase = input.nextLine();

		for (int i = 0; i < frase.length(); i++) {

			if (frase.charAt(i) == ' ') {
				break;
			}

			System.out.print(frase.charAt(i));

		}

	}

}