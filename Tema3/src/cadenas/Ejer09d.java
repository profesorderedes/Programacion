package cadenas;

import java.util.Scanner;

public class Ejer09d {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca una frase.");
		String frase = entrada.nextLine();

		String nuevaFrase = frase.substring(frase.indexOf(" ") + 1);

		// Caso particular de que la frase sólo tiene una palabra.
		if (frase.equals(nuevaFrase)) {
			nuevaFrase = "";
		}

		System.out.println(nuevaFrase);

	}

}