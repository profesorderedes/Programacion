package hoja3;

import java.util.Scanner;

public class Ejer07 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int i = 2;

		while (i <= 100) {

			System.out.print(i);

			int resto = i % 20;

			if (resto == 0) {
				System.out.print(" Es divisible por 20");
			}

			System.out.println();
			i = i + 2;
		}

	}

}