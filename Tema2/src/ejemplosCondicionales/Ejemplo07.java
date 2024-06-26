// Programa que pregunta de qué provincia eres
// y te responde con un mensaje adecuado.
package ejemplosCondicionales;

import java.util.Scanner;

public class Ejemplo07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿En qué provincia naciste?");
		String provincia = entrada.nextLine();

		provincia = provincia.toUpperCase();

		switch (provincia) {

		case "ALICANTE":
			System.out.println("¡Eres alicantino!");
			break;

		case "VALENCIA":
			System.out.println("¡Eres valenciano!");
			break;

		case "CASTELLÓN":
			System.out.println("¡Eres castellonense!");
			break;

		default:
			System.out.println("Lo siento, no conozco esa provincia.");

		}

	}

}
