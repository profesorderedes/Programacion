package hoja2;

import java.util.Scanner;

public class Ejer13 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num;

		do {

			System.out.println("Escriba un número del 1 al 20: ");
			num = entrada.nextInt();

		} while (num < 1 || num > 20);

		System.out.println("Tu número es: " + num + ".");

	}

}