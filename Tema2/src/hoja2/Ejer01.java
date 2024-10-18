package hoja2;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {

		// Crea un programa que pida un carácter al usuario. A continuación lo escribirá
		// 100 veces.

		Scanner sc = new Scanner(System.in);

		System.out.println("Escriba un carácter, por favor.");
		String caracter = sc.nextLine();

		int i = 1;

		while (i <= 100) {

			System.out.println(i + ") " + caracter);
			i++;

		}

		System.out.println("Muchas gracias.");

	}

}