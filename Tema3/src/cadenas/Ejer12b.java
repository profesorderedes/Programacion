package cadenas;

import java.util.Arrays;

import java.util.Scanner;

public class Ejer12b {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Escribe una frase: ");
		String frase = input.nextLine();

		// String frase = "Frase de prueba, hay 6 palabras.";

		System.out.println(frase);
		int pos = 0;
		int numEspacios = 0;

		// Contamos cuántos espacios hay

		while (frase.indexOf(" ", pos) != -1) {

			pos = frase.indexOf(" ", pos) + 1;
			numEspacios++;

		}

		int inicio = 0;
		int fin;

		// Creamos un array con tantas posiciones como palabras
		String[] palabras = new String[numEspacios + 1];

		// Guardamos cada palabra en una posición del array

		for (int i = 0; i < palabras.length; i++) {

			fin = frase.indexOf(" ", inicio);

			if (fin == -1) {
				palabras[i] = frase.substring(inicio);
			} else {
				palabras[i] = frase.substring(inicio, fin);
			}

			inicio = fin + 1;

		}

		// Enseñamos el array
		System.out.println("Array:\n" + Arrays.toString(palabras));

	}

}