package ejerciciosCadenas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer12b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Dime una frase: ");
		String frase = entrada.nextLine();

		// Recorremos la cadena de espacio en espacio.
		int ini = 0;
		int espacios = 0;

		// Contamos cuántos espacios hay en la frase.
		while (frase.indexOf(" ", ini) != -1) {
			espacios++;
			ini = frase.indexOf(" ", ini) + 1;
		}

		System.out.println("Hay " + (espacios + 1) + " palabras.");

		String[] palabras = new String[espacios + 1];

		// Rellenamos el array de palabras colocando una palabra en cada posición.

		int fin;
		int pos = 0;
		ini = 0;

		// Mientras quede algún espacio en la frase, seguimos mostrando palabras.
		while (frase.indexOf(" ", ini) != -1) {

			// fin será la posición del siguiente espacio
			fin = frase.indexOf(" ", ini);

			// Mostramos la palabra entre las posiciones ini y fin.
			// System.out.println(frase.substring(ini, fin));
			palabras[pos] = frase.substring(ini, fin);
			pos++;

			// Actualizamos ini para que sea la posición justo después del
			// espacio.
			ini = fin + 1;

		}

		// Falta por mostrar la última palabra, ya que ésta no tiene un espacio
		// al final.
		// System.out.println(frase.substring(ini));
		palabras[pos] = frase.substring(ini);

		// Mostramos el array.

		for (int i = 0; i < palabras.length; i++) {
			System.out.println(palabras[i]);
		}

	}

}
