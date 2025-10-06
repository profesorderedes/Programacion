package hoja1;

import java.util.Scanner;

public class Ejer13 {

	public static void main(String[] args) {

// Modifica el programa anterior para que acepte una nota con decimales (por ejemplo, si la nota
// es menor que 5, la calificación será de Insuficiente)

		Scanner input = new Scanner(System.in);

		System.out.print("Dime una nota entera del 0-10: ");
		float nota = input.nextFloat();

		if (nota < 0 || nota > 10) {

			System.out.println("\n\nEsto no es un valor válido");
		} else if (nota < 5) {

			System.out.println("\n\nHas sacado un \"Insuficiente\"");
		} else if (nota < 6) {

			System.out.println("\n\nHas sacado un \"Suficiente\"");
		} else if (nota < 7) {

			System.out.println("\n\nHas sacado un \"Bien\"");
		} else if (nota < 9) {

			System.out.println("\n\nHas sacado un \"Notable\"");
		} else {

			System.out.println("\n\nHas sacado un \"Sobresaliente\"");
		}

	}

}