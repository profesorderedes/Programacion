package cadenas;

import java.util.Scanner;

public class Ejer17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Dime una frase y te quitaré la última palabra: ");
		String frase = input.nextLine();

		String[] palabras = frase.split(" ");

		for (int i = 0; i < palabras.length - 1; i++) {

			System.out.print(palabras[i] + " ");

		}

	}

}