package hoja1;

import java.util.Scanner;

public class Ejer07 {

	public static void main(String[] args) {

// 7.- Crea un array de 10 elementos de tipo double llamado notas. Ve leyendo las diez notas desde la
// consola, mediante un bucle while, y guardándolas en el array. A continuación, muestra las diez
// notas.

		Scanner input = new Scanner(System.in);

		double[] notas = new double[10];
		int i = 0;

		while (i < notas.length) {

			System.out.print("Nota " + (i + 1) + ": ");
			notas[i] = input.nextDouble();

			i++;

		}

		System.out.println("\nNotas guardadas en el array: ");

		for (int j = 0; j < notas.length; j++) {

			System.out.println("- " + notas[j]);

		}

	}

}