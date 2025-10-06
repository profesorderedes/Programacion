package hoja1;

import java.util.Scanner;

public class Ejer12 {

	public static void main(String[] args) {

// Diseña un programa que pida una nota entera entre 0 y 10 y la convierta a la
// calificación correspondiente (Insuficiente, Suficiente, Bien, Notable y
// Sobresaliente).

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese su nota: ");
		int nota = entrada.nextInt();

		if (nota >= 0 && nota <= 4) {

			System.out.println("Insuficiente.");

		} else if (nota == 5) {

			System.out.println("Suficiente");

		} else if (nota == 6) {

			System.out.println("Bien.");

		} else if (nota >= 7 && nota <= 8) {

			System.out.println("Notable.");

		} else if (nota >= 9 && nota <= 10) {

			System.out.println("Sobresaliente.");

		} else {

			System.out.println("Ingrese una nota válida.");

		}

	}

}