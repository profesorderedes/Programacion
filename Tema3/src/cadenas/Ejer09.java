package cadenas;

import java.util.Scanner;

public class Ejer09 {

	public static void main(String[] args) {

// Programa que lee una frase desde el teclado y la muestra
// quitando la primera palabra.

		Scanner input = new Scanner(System.in);

		System.out.println("Dime una frase: ");
		String frase = input.nextLine();

		boolean primeraPalabraFuera = false;

		// Recorremos la frase letra a letra.
		for (int i = 0; i < frase.length(); i++) {

			// Si hemos pasado la primera palabra, mostramos el carácter.
			if (primeraPalabraFuera) {
				System.out.print(frase.charAt(i));
				
			} else if (frase.charAt(i) == ' ') {
				
				// Al encontrar el primer espacio, cambiamos el valor
				// de primeraPalabraFuera para indicar que ya hemos dejado 
				// atrás la primera palabra.
				primeraPalabraFuera = true;
			}

		}

	}

}