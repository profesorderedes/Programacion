package hoja1;

import java.util.Scanner;

// Programa que te pregunte un número entero y te diga si es primo o no.

public class Ejer14a {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("\n\nDame un número para ver si es primo");
		int num = input.nextInt();

		boolean esPrimo = true;

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {
				esPrimo = false;
				break;
			}

		}

		if (esPrimo) {
			System.out.println("El número " + num + " es un número primo");
		} else {
			System.out.println("El número " + num + " NO es un número primo");
		}

	}

}