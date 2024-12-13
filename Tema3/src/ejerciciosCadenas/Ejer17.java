package ejerciciosCadenas;

import java.util.Scanner;

public class Ejer17 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¡¡Escribe una frase y te la mostraré quitando la última palabra!!");
		String frase = entrada.nextLine();

		String[] palabras = frase.split(" ");
		
		for (int i = 0; i < palabras.length - 1; i++) {
			System.out.print(palabras[i] + " ");
		}
	}

}
