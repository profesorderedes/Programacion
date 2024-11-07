package hoja3;

import java.util.Scanner;

public class Ejer08 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce un número entero: ");
		int numero = scanner.nextInt();

		System.out.println("Números del 1 al " + numero + ":");
		for (int i = 1; i <= numero; i++) {
			System.out.println(i);
		}
	}
}
