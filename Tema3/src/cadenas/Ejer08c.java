package cadenas;

import java.util.Scanner;

public class Ejer08c {

	public static void main(String[] args) {

// Programa que lee una frase desde el teclado y nos muestra
// la primera palabra.

		Scanner input = new Scanner(System.in);

		System.out.println("Dime una frase: ");
		String frase = input.nextLine();

		String palabra = "";

		// Recorremos la cadena letra a letra.
		for (int i = 0; i < frase.indexOf(" "); i++) {

			// A la variable palabra le añadimos el caracter de la posición i.
			palabra = palabra + frase.charAt(i);

		}

		System.out.println("Primera palabra: " + palabra);

	}

}