package cadenas;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {

// Programa que lea una palabra desde la terminal y te diga cuántas letras

// tiene.

		Scanner input = new Scanner(System.in);

		System.out.println("Dime una palabra: ");
		String palabra = input.nextLine();

		System.out.println("Esa palabra tiene " + palabra.length() + " caracteres.");

	}

}