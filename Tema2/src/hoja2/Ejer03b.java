package hoja2;

import java.util.Scanner;

public class Ejer03b {

	// Ejercicio 3 usando bucle do-while
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num;
		do {

			// Volvemos a preguntar el número, porque no es válido.
			System.out.println("Escribe un número entre 1 y 10:");
			num = entrada.nextInt();

		}while (num < 1 || num > 10);

		System.out.println("Has escrito el número " + num + ".");

	}

}
