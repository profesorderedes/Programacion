package hoja2Bucles;

import java.util.Scanner;

public class Ejer23 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce 5 notas válidas (entre 0 y 10):");

		double nota;
		double suma = 0;

		// Pedimos cinco notas.
		for (int i = 1; i <= 5; i++) {

			do {
				System.out.print("Nota " + i + ": ");
				nota = entrada.nextDouble();
			} while (nota < 0 || nota > 10);

			System.out.println();
			suma = suma + nota;

		}

		System.out.println("La nota media es " + suma / 5);

	}

}
