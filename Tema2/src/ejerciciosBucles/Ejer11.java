package ejerciciosBucles;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num;

		do {
			System.out.println("Escribe un número entre 1 y 20:");
			num = entrada.nextInt();
		} while (num < 1 || num > 20);

		System.out.println("Por fin lo has escrito bien.");

	}

}
