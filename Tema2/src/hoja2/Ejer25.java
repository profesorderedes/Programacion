package hoja2;

import java.util.Scanner;

public class Ejer25 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¡A ver si adivinas el número secreto!\n");

		int num = 0;
		for (int i = 1; i <= 10; i++) {

			System.out.print("? ");
			num = entrada.nextInt();

			if (num == 6) {
				break;
			}

		}

		if (num == 6) {
			System.out.println("¡Has acertado!");
		} else {
			System.out.println("¡Has fallado!");
		}

	}

}
