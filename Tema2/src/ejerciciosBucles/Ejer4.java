package ejerciciosBucles;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Adivina el número entre 1 y 5.");
		int numero = entrada.nextInt();

		while (numero != 3) {
			if (numero < 1 || numero > 5) {
				System.out.println("Número fuera de rango.");
			} else if (numero > 1 || numero < 5) {
				System.out.println("Número incorrecto. "
						+ "Inténtalo de nuevo.");
			}
			
			System.out.println("Adivina el número entre 1 y 5.");
			numero = entrada.nextInt();
		}
		System.out.println("Número correcto.");

	}

}