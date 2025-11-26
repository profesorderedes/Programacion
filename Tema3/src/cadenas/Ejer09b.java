package cadenas;

import java.util.Scanner;

public class Ejer09b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca una frase.");
		String frase = entrada.nextLine();

		String palabra = "";

		// Recorremos la cadena letra a letra.
		for (int i = 0; i < frase.length(); i++) {

			// Si encontramos un espacio paramos.
			if (frase.charAt(i) == ' ') {
				break;
			}

			// A la variable palabra le añadimos el caracter de la posición i.
			palabra = palabra + frase.charAt(i);

		}

		// Creamos una nueva variable sin la primera palabra.
		String nuevaFrase = frase.replace(palabra + " ", "");

		System.out.println(nuevaFrase);

	}

}