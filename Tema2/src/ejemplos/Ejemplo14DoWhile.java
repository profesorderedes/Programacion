package ejemplos;

import java.util.Scanner;

public class Ejemplo14DoWhile {

	public static void main(String[] args) {

		// Programa que pide un número y repite la pregunta mientras el número
		// introducido
		// no esté entre 1 y 5.

		Scanner entrada = new Scanner(System.in);

		int num;
		do {
			System.out.print("Escriba un número entre 1 y 5: ");
			num = entrada.nextInt();
		} while (num < 1 || num > 5);

		System.out.println("Ha escrito el número " + num + ".");

	}

}
