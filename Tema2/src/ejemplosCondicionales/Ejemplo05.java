// Programa que te pregunte en qué color está un semáforo
// y te diga si tienes que pasar, o frenar, o frenar si 
// te da tiempo.
package ejemplosCondicionales;

import java.util.Scanner;

public class Ejemplo05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿De qué color está el semáforo?");
		String color = entrada.nextLine();

		color = color.toLowerCase();

		if (color.equals("verde")) {
			System.out.println("Pasar");
		} else if (color.equals("rojo")) {
			System.out.println("Parar");
		} else {
			System.out.println("Frenar si estamos a tiempo");
		}

		System.out.println("Gracias.");

	}

}
