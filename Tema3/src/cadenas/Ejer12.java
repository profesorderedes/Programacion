package cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer12 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduzca una frase y te separo las palabras.\n>");
		String frase = entrada.nextLine();

		// Cada palabra que encontremos estará enrte las posiciones inicio y fin.
		int numPalabras = 1;
		int inicio = 0;
		int fin = 0;
		int posArray = 0;

		// Contamos cuántas palabras hay.
		for (int i = 0; i < frase.length(); i++) {

			if (frase.charAt(i) == ' ') {
				numPalabras = numPalabras + 1;
			}
		}
		
		// Creamos un array con tantas posiciones como palabras.
		String[] palabras = new String[numPalabras];

		// Guardamos cada palabra en una posición del array.
		while (frase.indexOf(" ", inicio) != -1) {
			fin = frase.indexOf(" ", inicio);

			System.out.println(frase.substring(inicio, fin));
			palabras[posArray] = frase.substring(inicio, fin);
			posArray = posArray + 1;

			inicio = fin + 1;
		}

		// Añadimos la última palabra de la frase.
		System.out.println(frase.substring(inicio));
		palabras[posArray] = frase.substring(inicio);
		System.out.println("Array:\n" + Arrays.toString(palabras));
	}
}