package hoja2;

import java.util.Scanner;

public class Ejer13 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numero;

		do {

			System.out.println("Escribe un número entre 1 y 20");
			numero = entrada.nextInt();

		} while (numero < 1 || numero > 20);

		System.out.println("Has escrito el número " + numero + ".");

	}

}
