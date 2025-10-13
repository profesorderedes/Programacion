package hoja2;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {

// Modifica el programa anterior para que pida un carácter y también el número de veces que
// queremos repetirlo.

		Scanner input = new Scanner(System.in);

		System.out.println("Introduce un carácter: ");
		String character = input.nextLine();

		System.out.print("¿Cuántas veces lo quieres repetir?\n> ");
		int repeticiones = input.nextInt();
		int i = 1;

		while (i <= repeticiones) {

			System.out.println(i + ": " + character);
			i++;

		}

	}

}