package cadenas;

import java.util.Scanner;

public class Ejer09d {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca una frase.");
		String frase = entrada.nextLine();

		String nuevaFrase = "";

		// Recorremos la cadena letra a letra.
		for (int i = frase.indexOf(" ") + 1; i < frase.length(); i++) {

			// A la variable palabra le añadimos el caracter de la posición i.
			nuevaFrase = nuevaFrase + frase.charAt(i);

		}

		System.out.println(nuevaFrase);

	}

}