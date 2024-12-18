package extraEjerciciosCadenas;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("*** Acortador de texto ***\n");

		System.out.println("Escribe una frase y la acortaré de manera que no exceda los 20 caracteres:");
		String frase = entrada.nextLine();

		System.out.println("Frase recortada:");

		if (frase.length() <= 20) {

			System.out.println(frase);

		} else {

			System.out.println(frase.substring(0, 17) + "...");

		}

	}

}