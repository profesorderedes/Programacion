package hoja2;

import java.util.Scanner;

public class Ejer25 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numero = 0;
		final int NUMERO_SECRETO = 6;
		boolean acertado = false;

		for (int i = 1; i <= 10; i++) {

			System.out.println("Prube un numero");
			numero = teclado.nextInt();

			if (numero == NUMERO_SECRETO) {

				acertado = true;
				break;

			}

		}

		if (acertado)
			System.out.println("Felicidades");
		else
			System.out.println("Has perdido.");

	}

}