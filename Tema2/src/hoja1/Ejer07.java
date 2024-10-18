package hoja1;

import java.util.Scanner;

public class Ejer07 {

	public static void main(String[] args) {

		final int NUMERO_SECRETO = 3;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca un número del 1 al 10");
		int numero = teclado.nextInt();

		if (numero != NUMERO_SECRETO) {
			System.out.println("Lo siento has perdido.");
		} else {
			System.out.println("Correcto, has ganado.");
		}

	}

}