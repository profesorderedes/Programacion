package ejerciciosBucles;

import java.util.Scanner;

public class Ejer09b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dame un número:");
		int resto = entrada.nextInt();

		System.out.println("Dame otro número:");
		int divisor = entrada.nextInt();

		boolean restar = true;

		if (resto < divisor) {
			System.out.println("El dividendo debe ser mayor o " + "igual que el divisor.");
		} else {
			
			while (restar) {

				System.out.println(resto + " - " + divisor + " = " + (resto - divisor));
				resto = resto - divisor;

				if (resto < divisor) {
					restar = false;
				}

			}
			
			System.out.println("\nEl resto vale " + resto);
		}

		

	}

}