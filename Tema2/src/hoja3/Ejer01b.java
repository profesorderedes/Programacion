package hoja3;

import java.util.Scanner;

public class Ejer01b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int i = 1;

		final int SOLUCION = (int) (Math.random() * 10 + 1);

		System.out.println(SOLUCION);

		System.out.println("Escribe un número para adivinar");

		while (i <= 3) {

			int respuesta = entrada.nextInt();

			if (respuesta == SOLUCION) {

				System.out.println("Has acertado");
				break;

			} else {

				System.out.println("vuelve a intentarlo");

			}

			System.out.println("intentos realizados :" + i);
			i++;

		}

		if (i == 4) {

			System.out.println("Has fallado");

		}

	}

}