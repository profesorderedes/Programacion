package ejerciciosBucles;

import java.util.Scanner;

public class Ejer18 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Leemos 5 notas.
		int nota;
		for (int i = 1; i <= 5; i++) {

			System.out.println("Nota " + i + ": ");
			nota = entrada.nextInt();

			// Si la nota no está entre 0 y 10, se irá
			// repitiendo la pregunta.
			while (nota < 0 || nota > 10) {

				System.out.println("Nota " + i + ": ");
				nota = entrada.nextInt();

			}

			// Una vez que la nota sea correcta, el programa
			// continúa.

		}

	}

}
