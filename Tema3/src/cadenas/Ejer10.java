package cadenas;

import java.util.Scanner;

// Actividad 10: Programa que lee una frase y nos dice por cuántas palabras está formada. 
// Usa el método indexOf(String cadena, int posicion).

public class Ejer10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String frase = "No hay dos sin tres";

		// Vamos a buscar repetidamente la cadena " ". Ya que el número de palabras va a
		// ser
		// el número de espacios más uno.

		// Posición a partir de la cual voy a buscar el siguiente espacio.
		int posBusqueda = 0;

		int numEspacios = 0;

		while (frase.indexOf(" ", posBusqueda) != -1) {

			numEspacios++;
			System.out.println(frase.indexOf(" ", posBusqueda));
			posBusqueda = frase.indexOf(" ", posBusqueda) + 1;

		}

		System.out.println("Total de palabras en la frase: " + (numEspacios + 1) + ".");

	}

}





