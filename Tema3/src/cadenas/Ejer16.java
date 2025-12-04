package cadenas;

import java.util.Scanner;

public class Ejer16 {

	public static void main(String[] args) {

// Leer una frase y generar su acrónimo (primera letra, en maúsculas, de cada
// frase).

		Scanner input = new Scanner(System.in);

		System.out.println("Dime una frase y te dare su acrónimo:");
		String frase = input.nextLine();

		String[] fraseArray = frase.split(" ");
		String acronimo = "";

		for (int i = 0; i < fraseArray.length; i++) {

			acronimo = acronimo + fraseArray[i].toUpperCase().charAt(0);

		}

		System.out.println(acronimo);

	}

}