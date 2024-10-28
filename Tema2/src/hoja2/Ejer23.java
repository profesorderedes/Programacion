package hoja2;

import java.util.Scanner;

public class Ejer23 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Bucle exterior: leemos 5 notas válidas.
		for (int i = 1; i <= 5; i++) {

			// Leemos la siguiente nota.
			System.out.print("Nota? ");
			int nota = entrada.nextInt();

			// Mientras la nota leída no sea válida, repetimos
			// la lectura.
			while (nota < 0 || nota > 10) {
				System.out.println("Nota no válida. Nota? ");
				nota = entrada.nextInt();
			}

			// Indicamos cuántas notas válidas hay hasta ahora.
			System.out.println("Notas válidas: " + i + "\n");

		}

	}

}
