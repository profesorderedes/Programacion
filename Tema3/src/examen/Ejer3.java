package examen;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una frase y te quitaré los espacios al principio y al final:");
		String frase = entrada.nextLine();

		System.out.println("\nFrase original:\n#" + frase + "#");

		// Eliminamos los espacios al principio.

		for (int i = 0; i < frase.length(); i++) {

			// En el momento en que encontramos un carácter que no
			// es un espacio, nos quedamos con la subcadena a
			// partir de ahí.
			if (frase.charAt(i) != ' ') {
				frase = frase.substring(i);
				break;
			}

		}

		// Eliminamos los espacios al final.

		for (int i = frase.length() - 1; i >= 0; i--) {

			// En el momento en que encontramos un carácter que no
			// es un espacio, nos quedamos con la subcadena
			// hasta ahí.
			if (frase.charAt(i) != ' ') {
				frase = frase.substring(0, i + 1);
				break;
			}

		}

		// Resultado.
		System.out.println("\nFrase resultante:\n#" + frase + "#");

	}

}
