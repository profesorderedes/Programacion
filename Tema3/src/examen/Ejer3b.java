package examen;

import java.util.Scanner;

public class Ejer3b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una frase y te quitaré los espacios al principio y al final:");
		String frase = entrada.nextLine();

		System.out.println("\nFrase original:\n#" + frase + "#");

		// Eliminamos los espacios al principio.

		for (int i = 0; i < frase.length(); i++) {

			// ¿Hay un espacio en la posición i?
			if (frase.charAt(i) != ' ') {
				frase = frase.substring(i);
				break;
			}

		}
		
		System.out.println("#" + frase + "#");

		// Eliminamos los espacios al final.

		for (int i = frase.length() - 1; i >= 0; i--) {

			// ¿Hay un espacio en la posición i?
			if (frase.charAt(i) != ' ') {
				frase = frase.substring(0, i+1);
				break;
			}

		}
		
		System.out.println("#" + frase + "#");
		

	}
}
