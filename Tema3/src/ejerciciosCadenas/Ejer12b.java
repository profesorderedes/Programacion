package ejerciciosCadenas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer12b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

//		System.out.print("Dime una frase: ");
//		String frase = entrada.nextLine();
		String frase = "PROGRAMA QUE LEE UNA FRASE";

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
		

	}

}
