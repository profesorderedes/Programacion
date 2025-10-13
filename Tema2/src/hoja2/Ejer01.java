package hoja2;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {

// Crea un programa que pida un carácter al usuario. A continuación lo escribirá 100 veces.

		Scanner input = new Scanner(System.in);

		System.out.println("Introduce un carácter: ");
		String character = input.nextLine();

		int i = 1;

		while (i <= 100) {

			System.out.println(i + ": " + character);
			i++;

		}

	}

}