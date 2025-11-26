package cadenas;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {

// Programa que pide una frase y dos letras. A continuación
// muestra la frase sustituyendo la primera letra por la
// segunda.

		Scanner input = new Scanner(System.in);

		System.out.println("Dime una frase: ");
		String frase1 = input.nextLine();

		System.out.println("Letra 1 (reemplazar): ");
		String letra1 = input.nextLine();

		System.out.println("Letra 2 (reemplazar con): ");
		String letra2 = input.nextLine();

		String frase2 = frase1.replace(letra1, letra2);

		System.out.println("Nueva frase: " + frase2);

	}

}