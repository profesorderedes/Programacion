package cadenas;

import java.util.Scanner;

public class Ejer15 {

	public static void main(String[] args) {

// Leer una frase y mostrarla al revés (por palabras).

		Scanner input = new Scanner(System.in);

		System.out.println("Dime una frase y te lo repetire al revés:");
		String frase = input.nextLine();

		String[] fraseArray = frase.split(" ");

		for (int i = fraseArray.length - 1; i >= 0; i--) {

			System.out.println(fraseArray[i]);

		}

	}

}