package ejerciciosCondicionales;

import java.util.Scanner;

public class Ejer18 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime un número entero:");

		if (entrada.hasNextInt() == true) {
			int numero = entrada.nextInt();
			System.out.println("El número que has escrito es: " + numero);
		} else {
			System.out.println("El número escrito no es correcto");
		}

	}

}