package hoja2;

import java.util.Scanner;

public class Ejer16 {

	public static void main(String[] args) {

// Diseña un programa que invente un número aleatorio. A continuación pedirá al usuario que lo
// adivine. Si el usuario falla, entonces el programa le dará otra oportunidad. Una vez que el usuario
// adivina el número o falla tres veces, el programa termina.
// Utiliza un bucle do-while.

		Scanner input = new Scanner(System.in);

		final int RAND_NUM = (int) (Math.random() * 10 + 1);

		int tries = 0;
		boolean guessed = false;
		int intento;

		System.out.println(RAND_NUM);

		do {

			System.out.println("Adivina el número aleatorio entre 1 y 10: ");
			intento = input.nextInt();

			if (intento == RAND_NUM) {

				guessed = true;

			} else {

				tries++;

			}

		} while (guessed != true && tries < 3);

		if (guessed == true) {

			System.out.println("Muy bien! Era el " + RAND_NUM);
		} else {

			System.out.println("Vaya, no lo acertaste :(");
		}

	}

}