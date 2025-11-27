package cadenas;

import java.util.Scanner;

// Actividad 11: Programa que lee una frase y luego muestra las palabras sueltas 
// (una en cada línea).

public class Ejer11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una frase y te separo las palabras:");
		String frase = entrada.nextLine();

		// Cada palabra que encontremos estará entre las posiciones inicio y fin.
		int inicio = 0;
		int fin;

		// Vamos buscando cada espacio en la cadena.
		while (frase.indexOf(" ", inicio) != -1) {

			fin = frase.indexOf(" ", inicio);

			// Entre el último espacio y el espacio recién encontrado está la palabra
			// siguiente
			System.out.println(frase.substring(inicio, fin));

			// Buscaremos el siguiente espacio una posición después del último
			// espacio encontrado.
			inicio = fin + 1;

		}

		// Mostramos la última palabra de la frase.
		System.out.println(frase.substring(inicio));

	}

}
