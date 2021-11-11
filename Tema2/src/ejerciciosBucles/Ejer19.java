package ejerciciosBucles;

import java.util.Scanner;

public class Ejer19 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		final int NUM_NOTAS = 5;

		// Leemos 5 notas.
		int nota;
		float suma = 0;

		for (int i = 1; i <= NUM_NOTAS; i++) {

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
			suma = suma + nota;

		}

		System.out.println(suma / NUM_NOTAS);

	}

}
