package ejerciciosCadenas;

import java.util.Scanner;

public class Ejer15 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¡¡Escribe una frase y te la mostraré al revés!!");
		String frase = entrada.nextLine();

		String[] palabras = frase.split(" ");

		for (int i = palabras.length - 1; i >= 0; i--) {
			System.out.print(palabras[i] + " ");
		}

	}

}