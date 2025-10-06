package hoja1;

import java.util.Scanner;

public class Ejer07 {

	public static void main(String[] args) {
		
		final int NUMERO_SECRETO = 7;

		Scanner input = new Scanner(System.in);

		System.out.print("Introduce un número entero del 1-10: ");
		int adivinanza = input.nextInt();

		if (adivinanza == NUMERO_SECRETO) {

			System.out.println("\n\n¡Lo adivinaste!");

		} else {

			System.out.println("\n\nMal");

		}

	}

}