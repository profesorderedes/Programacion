package cadenas;

import java.util.Scanner;

//Programa que lee una frase desde el teclado y nos muestra
//la primera palabra.

public class Ejer08d {

	public static void main(String[] args) {

		// Programa que lee una frase desde el teclado y nos muestra
		// la primera palabra.
		// En esta versión usamos substring().

		Scanner input = new Scanner(System.in);

		System.out.println("Dime una frase: ");
		String frase = input.nextLine();

		String palabra = frase.substring(0, frase.indexOf(" "));

		System.out.println("Primera palabra: " + palabra);

	}

}