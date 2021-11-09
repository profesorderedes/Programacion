package ejerciciosBucles;

import java.util.Scanner;

public class Ejer09 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dame un número:");
		int resto = entrada.nextInt();

		System.out.println("Dame otro número:");
		int num2 = entrada.nextInt();

		while (resto >= num2) {
			System.out.println(resto + " - " + num2 + " = " + (resto - num2));
			resto = resto - num2;
		}

		System.out.println("\nEl resto vale " + resto);

	}

}