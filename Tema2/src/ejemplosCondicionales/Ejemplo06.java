// Programa que pregunta la clasificación de un corredor y nos muestra
// qué premio le corresponde.
package ejemplosCondicionales;

import java.util.Scanner;

public class Ejemplo06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Clasificación del jugador (1 / 2 / 3): ");
		int clasificacion = entrada.nextInt();

		switch (clasificacion) {

		case 1:
			System.out.println("Medalla de oro.");
			break;

		case 2:
			System.out.println("Medalla de plata.");
			break;

		case 3:
			System.out.println("Medalla de bronce.");
			break;

		default:
			System.out.println("Lo siento, no tienes medalla.");
		}

//		if (clasificacion == 1) {
//			System.out.println("Medalla de oro.");
//		} else if (clasificacion == 2) {
//			System.out.println("Medalla de plata.");
//		} else if (clasificacion == 3) {
//			System.out.println("Medalla de bronce.");
//		} else {
//			System.out.println("Lo siento, no tienes medalla.");
//		}

	}

}
