package ejerciciosCondicionales;

import java.util.Scanner;

public class Ejer18b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime un número entero:");

		if (entrada.hasNextInt() == true) {
			int numero = entrada.nextInt();

			if (numero >= 1 && numero <= 10) {
				System.out.println("El número que has escrito es: " + numero);
			} else {
				System.out.println("Tenías que escribir un número entre 1 y 10.");
			}
		} else {
			System.out.println("El número escrito no es correcto");
		}

	}

}