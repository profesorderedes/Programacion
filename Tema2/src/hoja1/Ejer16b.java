package hoja1;

import java.util.Scanner;

public class Ejer16b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Nota: ");
		float nota = entrada.nextFloat();

		// Versión suponiendo que el número que introduce el
		// usuario puede no estar entre 0 y 10 (quizá se equivoque).

		if (nota >= 0 && nota < 4) {
			System.out.println("Rojo");
		} else if (nota >= 4 && nota < 5) {
			System.out.println("Verde");
		} else if (nota >= 5 && nota <= 10) {
			System.out.println("Azul");
		} else {
			System.out.println("La nota no es válida.");
		}

	}
}
