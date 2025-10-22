package hoja2;

import java.util.Scanner;

public class Ejer16b {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero = (int) (Math.random() * 10 + 1);
		int respuesta;
		int i = 0;

		System.out.println(numero);

		do {

			System.out.println("Adivina el número del uno al diez: ");
			respuesta = sc.nextInt();

			if (respuesta != numero) {

				i++;
				System.out.println("Error");

			}

		} while (numero != respuesta && i < 3);

		if (i == 3) {

			System.out.println("Has perdido");

		} else {

			System.out.println("Lo adivinaste, era " + numero);

		}

	}

}
