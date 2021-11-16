package ejercicios2;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int num;

		System.out.println("¡Adivina el número!");

		for (int i = 1; i <= 5; i++) {
			System.out.print("Número? ");
			num = entrada.nextInt();
		}

		System.out.println("Has fallado.");

	}

}
